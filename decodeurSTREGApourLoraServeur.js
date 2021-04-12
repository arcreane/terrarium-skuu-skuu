// Decode decodes an array of bytes into an object.
//  - fPort contains the LoRaWAN fPort number
//  - bytes is an array of bytes, e.g. [225, 230, 255, 0]
// The function must return an object, e.g. {"temperature": 22.5}
function Decode(fPort, bytes) {
  var decoded = {};
  var batterie = String.fromCharCode(bytes[0]) + String.fromCharCode(bytes[1]) + String.fromCharCode(bytes[2]) + String.fromCharCode(bytes[3]);
  decoded.batteryValve = batterie;
  
  decoded.etat = bytes[4];
  if (decoded.etat == 52)
  {
    	decoded.valve = "fermé";
    	decoded.couvercle = "fermé";
  }
 if (decoded.etat == 53)
  {
    	decoded.valve = "ouvert";
    	decoded.couvercle = "fermé";
  } 
  if (decoded.etat == 54)
  {
    	decoded.valve = "fermé";
    	decoded.couvercle = "ouvert";
  }
   if (decoded.etat == 55)
  {
    	decoded.valve = "ouvert";
    	decoded.couvercle = "ouvert";
  }
  var value_temp = (bytes[6] * 256) + bytes[7];
  decoded.tempValve = ((value_temp / 65536) * 165) - 40;
  var value_humidite = (bytes[8] * 256) + bytes[9];
  decoded.humiditeValve = (value_humidite / 65536) * 100;
  return decoded;
}