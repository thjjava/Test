
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class HMACSHA1 {

	private static final String HMAC_SHA1 = "HmacSHA1";

	/**
	 * 生成签名数据
	 * 
	 * @param data 待加密的数据
	 * @param key  加密使用的key
	 * @return 生成MD5编码的字符串 
	 * @throws InvalidKeyException
	 * @throws NoSuchAlgorithmException
	 */
	public static String getHMAC_SHA1(byte[] data, byte[] key) {
		String result = "";
		try {
			SecretKeySpec signingKey = new SecretKeySpec(key, HMAC_SHA1);
			Mac mac = Mac.getInstance(HMAC_SHA1);
			mac.init(signingKey);
			byte[] rawHmac = mac.doFinal(data);
			result = MD5.encode(rawHmac);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}
	
	/** 
	 * MD5算法 
	 */  
	public static class MD5 {  
	  
	    /** 
	     * 获取MD5 结果字符串 
	     *  
	     * @param source 
	     * @return 
	     */  
	    public static String encode(byte[] source) {  
	        String s = null;  
	        char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };  
	        try {  
	            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");  
	            md.update(source);  
	            byte tmp[] = md.digest();   
	            char str[] = new char[16 * 2];   
	            int k = 0;   
	            for (int i = 0; i < 16; i++) {   
	                byte byte0 = tmp[i];   
	                str[k++] = hexDigits[byte0 >>> 4 & 0xf];   
	                str[k++] = hexDigits[byte0 & 0xf];   
	            }  
	            s = new String(str);   
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	        return s;  
	    }  
	      
	    public static String getMD5(String source) {  
	        return (source == null || "".equals(source)) ? "" : getMD5(source);  
	    }  
	}  
	
	public static void main(String[] args) {
		String str = "test123";
		System.out.println(getHMAC_SHA1(str.getBytes(),"HmacSha1".getBytes()));
	}

}
