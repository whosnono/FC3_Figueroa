package Proyecto_Final_FC3;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;



public class Bloque {

	private Date Timestamp;
	private String hash;
	private String Hashprevio;
	private String data;
	
	public Bloque( Date timestamp, String data) {
		timestamp = new java.util.Date();
		this.Timestamp = timestamp;
		this.data = data;
		this.hash = calcularHash();
	}
	
	public String calcularHash() {
		
		String dataToHash = this.data;
		

		String valorHash = null;
        String valorAnt = null;
        String s1 = null;
		
		try {
            if(Hashprevio == null){
              valorHash = toHexString(getSHA(dataToHash));  
               s1 = dataToHash;
            } else{
                valorAnt = toHexString(getSHA(dataToHash));
                valorHash = toHexString(getSHA(valorAnt + s1));
            }
         
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		this.hash = valorHash;
		return valorHash;
	}

    public static byte[] getSHA(String data) throws NoSuchAlgorithmException {
        // Static getInstance method is called with hashing SHA
        MessageDigest md = MessageDigest.getInstance("SHA-256");
 
        // digest() method called
        // to calculate message digest of an input
        // and return array of byte
        return md.digest(data.getBytes(StandardCharsets.UTF_8));
    }
     
    public static String toHexString(byte[] hash)
    {
        // Convert byte array into signum representation
        BigInteger number = new BigInteger(1, hash);
 
        // Convert message digest into hex value
        StringBuilder hexString = new StringBuilder(number.toString(16));
 
        // Pad with leading zeros
        while (hexString.length() < 64)
        {
            hexString.insert(0, '0');
        }
 
        return hexString.toString();
    }

	public Date getTimestamp() {
		return Timestamp;
	}

	public void setTimestamp(Date timestamp) {
		Timestamp = timestamp;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getHashprevio() {
		return Hashprevio;
	}

	public void setHashprevio(String hashprevio) {
		this.Hashprevio = hashprevio;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
