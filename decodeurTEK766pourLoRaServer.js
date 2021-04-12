/**
 * décodeur LoRa pour la sonde TEK766
 * niveau d'eau et température
 * au format pour le serveur LoRa
 */
function Decode(port, bytes) {
	var tableau = [];
	var decoded = {};
	if (bytes[0] == 0x10)
	{
		decoded.frameType = "Measurement";
		var niveau0 = (bytes[4] * 16) + bytes[5];
		decoded.niveau0 = niveau0;
		decode.temperature0 = bytes[6];
	}
	else
	{
		decoded.frameType = '0' + bytes[0];
	}  
  return decoded;
}