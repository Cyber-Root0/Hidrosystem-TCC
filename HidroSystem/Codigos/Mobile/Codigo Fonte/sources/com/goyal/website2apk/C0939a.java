package com.goyal.website2apk;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.goyal.website2apk.a */
public class C0939a {

    /* renamed from: a */
    static char[] f3149a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    private IvParameterSpec f3150b;

    /* renamed from: c */
    private SecretKeySpec f3151c;

    /* renamed from: d */
    private Cipher f3152d;

    public C0939a(String str, String str2) {
        this.f3150b = new IvParameterSpec(str2.getBytes());
        this.f3151c = new SecretKeySpec(str.getBytes(), "AES");
        try {
            this.f3152d = Cipher.getInstance("AES/CBC/NoPadding");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    public static byte[] m4992b(String str) {
        if (str == null || str.length() < 2) {
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return bArr;
    }

    /* renamed from: a */
    public byte[] mo4633a(String str) {
        if (str == null || str.length() == 0) {
            throw new Exception("Empty string");
        }
        try {
            this.f3152d.init(2, this.f3151c, this.f3150b);
            byte[] doFinal = this.f3152d.doFinal(m4992b(str));
            if (doFinal.length <= 0) {
                return doFinal;
            }
            int i = 0;
            for (int length = doFinal.length - 1; length >= 0; length--) {
                if (doFinal[length] == 0) {
                    i++;
                }
            }
            if (i <= 0) {
                return doFinal;
            }
            byte[] bArr = new byte[(doFinal.length - i)];
            System.arraycopy(doFinal, 0, bArr, 0, doFinal.length - i);
            return bArr;
        } catch (Exception e) {
            throw new Exception("[decrypt] " + e.getMessage());
        }
    }
}
