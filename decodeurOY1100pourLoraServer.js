/**
 * décodeur LoRa pour la sonde OY1100
 * température et humidité
 * au format pour le serveur LoRa
 */
function Decode(port, bytes) {
  
  var tableau = [];
  var decoded = {};
  
  var tm4AB = bytes[0];
  var tm4C = bytes[2] >> 4;
  var tm4 = tm4AB * 16 + tm4C;
  var temp4 = tm4 * 0.1;
  
  var hm4DE = bytes[1];
  var hm4F = bytes[2] & 0x015;
  var hm4 = hm4DE  * 16 + hm4F;
  var humidite4 = hm4 * 0.1;
  
  var mesure4 = [{"temperature":temp4}, {"humidite":humidite4}];
  tableau.push(mesure4);
  decoded.temperature4 = temp4;
  decoded.humidite4 = humidite4;
  
  var tm2AB = bytes[3];
  var tm2C = bytes[5] >> 4;
  var tm2 = tm2AB * 16 + tm2C;
  var temp2 = tm2 * 0.1;
  
  var hm2DE = bytes[4];
  var hm2F = bytes[5] & 0x015;
  var hm2 = hm2DE  * 16 + hm2F;
  var humidite2 = hm2 * 0.1;
  
  var mesure2 = [{"temperature":temp2}, {"humidite":humidite2}];
  tableau.push(mesure2);
  decoded.temperature2 = temp2;
  decoded.humidite2 = humidite2;
  
  var tm0AB = bytes[6];
  var tm0C = bytes[8] >> 4;
  var tm0 = tm0AB * 16 + tm0C;
  var temp0 = tm0 * 0.1;
  
  var hm0DE = bytes[7];
  var hm0F = bytes[8] & 0x015;
  var hm0 = hm0DE  * 16 + hm0F;
  var humidite0 = hm0 * 0.1;
  
  var mesure0 = [{"temperature":temp0}, {"humidite":humidite0}];
  tableau.push(mesure0);
  decoded.tableau = tableau;
  decoded.temperature0 = temp0;
  decoded.humidite0 = humidite0;
  return decoded;

}