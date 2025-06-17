/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encrypt;
/**
 *
 * @author van46
 */
//import java.io.UnsupportedEncodingException;
//import java.util.Arrays;
//
//public class DES {
//    private static final int[] IP = {
//            58, 50, 42, 34, 26, 18, 10, 2,
//            60, 52, 44, 36, 28, 20, 12, 4,
//            62, 54, 46, 38, 30, 22, 14, 6,
//            64, 56, 48, 40, 32, 24, 16, 8,
//            57, 49, 41, 33, 25, 17, 9, 1,
//            59, 51, 43, 35, 27, 19, 11, 3,
//            61, 53, 45, 37, 29, 21, 13, 5,
//            63, 55, 47, 39, 31, 23, 15, 7
//    };
//
//    private static final int[] FP = {
//            40, 8, 48, 16, 56, 24, 64, 32,
//            39, 7, 47, 15, 55, 23, 63, 31,
//            38, 6, 46, 14, 54, 22, 62, 30,
//            37, 5, 45, 13, 53, 21, 61, 29,
//            36, 4, 44, 12, 52, 20, 60, 28,
//            35, 3, 43, 11, 51, 19, 59, 27,
//            34, 2, 42, 10, 50, 18, 58, 26,
//            33, 1, 41, 9, 49, 17, 57, 25
//    };
//
//    private static final int[] E = {
//            32, 1, 2, 3, 4, 5,
//            4, 5, 6, 7, 8, 9,
//            8, 9, 10, 11, 12, 13,
//            12, 13, 14, 15, 16, 17,
//            16, 17, 18, 19, 20, 21,
//            20, 21, 22, 23, 24, 25,
//            24, 25, 26, 27, 28, 29,
//            28, 29, 30, 31, 32, 1
//    };
//
//    private static final int[][][] S_BOX = {
//            {
//                    {14,4,13,1,2,15,11,8,3,10,6,12,5,9,0,7},
//                    {0,15,7,4,14,2,13,1,10,6,12,11,9,5,3,8},
//                    {4,1,14,8,13,6,2,11,15,12,9,7,3,10,5,0},
//                    {15,12,8,2,4,9,1,7,5,11,3,14,10,0,6,13}
//            },
//            {
//                    {15,1,8,14,6,11,3,4,9,7,2,13,12,0,5,10},
//                    {3,13,4,7,15,2,8,14,12,0,1,10,6,9,11,5},
//                    {0,14,7,11,10,4,13,1,5,8,12,6,9,3,2,15},
//                    {13,8,10,1,3,15,4,2,11,6,7,12,0,5,14,9}
//            },
//            {
//                    {10,0,9,14,6,3,15,5,1,13,12,7,11,4,2,8},
//                    {13,7,0,9,3,4,6,10,2,8,5,14,12,11,15,1},
//                    {13,6,4,9,8,15,3,0,11,1,2,12,5,10,14,7},
//                    {1,10,13,0,6,9,8,7,4,15,14,3,11,5,2,12}
//            },
//            {
//                    {7,13,14,3,0,6,9,10,1,2,8,5,11,12,4,15},
//                    {13,8,11,5,6,15,0,3,4,7,2,12,1,10,14,9},
//                    {10,6,9,0,12,11,7,13,15,1,3,14,5,2,8,4},
//                    {3,15,0,6,10,1,13,8,9,4,5,11,12,7,2,14}
//            },
//            {
//                    {2,12,4,1,7,10,11,6,8,5,3,15,13,0,14,9},
//                    {14,11,2,12,4,7,13,1,5,0,15,10,3,9,8,6},
//                    {4,2,1,11,10,13,7,8,15,9,12,5,6,3,0,14},
//                    {11,8,12,7,1,14,2,13,6,15,0,9,10,4,5,3}
//            },
//            {
//                    {12,1,10,15,9,2,6,8,0,13,3,4,14,7,5,11},
//                    {10,15,4,2,7,12,9,5,6,1,13,14,0,11,3,8},
//                    {9,14,15,5,2,8,12,3,7,0,4,10,1,13,11,6},
//                    {4,3,2,12,9,5,15,10,11,14,1,7,6,0,8,13}
//            },
//            {
//                    {4,11,2,14,15,0,8,13,3,12,9,7,5,10,6,1},
//                    {13,0,11,7,4,9,1,10,14,3,5,12,2,15,8,6},
//                    {1,4,11,13,12,3,7,14,10,15,6,8,0,5,9,2},
//                    {6,11,13,8,1,4,10,7,9,5,0,15,14,2,3,12}
//            },
//            {
//                    {13,2,8,4,6,15,11,1,10,9,3,14,5,0,12,7},
//                    {1,15,13,8,10,3,7,4,12,5,6,11,0,14,9,2},
//                    {7,11,4,1,9,12,14,2,0,6,10,13,15,3,5,8},
//                    {2,1,14,7,4,10,8,13,15,12,9,0,3,5,6,11}
//            }
//    };
//
//    private static final int[] P = {
//            16, 7, 20, 21, 29, 12, 28, 17,
//            1, 15, 23, 26, 5, 18, 31, 10,
//            2, 8, 24, 14, 32, 27, 3, 9,
//            19, 13, 30, 6, 22, 11, 4, 25
//    };
//
//    private static final int[] PC1 = {
//            57, 49, 41, 33, 25, 17, 9,
//            1, 58, 50, 42, 34, 26, 18,
//            10, 2, 59, 51, 43, 35, 27,
//            19, 11, 3, 60, 52, 44, 36,
//            63, 55, 47, 39, 31, 23, 15,
//            7, 62, 54, 46, 38, 30, 22,
//            14, 6, 61, 53, 45, 37, 29,
//            21, 13, 5, 28, 20, 12, 4
//    };
//
//    private static final int[] PC2 = {
//            14, 17, 11, 24, 1, 5,
//            3, 28, 15, 6, 21, 10,
//            23, 19, 12, 4, 26, 8,
//            16, 7, 27, 20, 13, 2,
//            41, 52, 31, 37, 47, 55,
//            30, 40, 51, 45, 33, 48,
//            44, 49, 39, 56, 34, 53,
//            46, 42, 50, 36, 29, 32
//    };
//
//    private static final int[] SHIFTS = {
//            1, 1, 2, 2, 2, 2, 2, 2,
//            1, 2, 2, 2, 2, 2, 2, 1
//    };
//
//    private static int[] stringToBits(String s) {
//        try {
//            byte[] bytes = s.getBytes("UTF-8");
//            int[] bits = new int[bytes.length * 8];
//            for (int i = 0; i < bytes.length; i++) {
//                int val = bytes[i] & 0xFF;
//                for (int j = 0; j < 8; j++) {
//                    bits[i * 8 + (7 - j)] = (val >> j) & 1;
//                }
//            }
//            return bits;
//        } catch (UnsupportedEncodingException e) {
//            throw new RuntimeException("Encoding error: " + e.getMessage());
//        }
//    }
//
//    private static String bitsToString(int[] bits) {
//        try {
//            byte[] bytes = new byte[bits.length / 8];
//            for (int i = 0; i < bytes.length; i++) {
//                int val = 0;
//                for (int j = 0; j < 8; j++) {
//                    val = (val << 1) | bits[i * 8 + j];
//                }
//                bytes[i] = (byte) val;
//            }
//            return new String(bytes, "UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            throw new RuntimeException("Decoding error: " + e.getMessage());
//        }
//    }
//
//    private static int[] padToBlock(int[] bits) {
//        int padLength = (64 - (bits.length % 64)) % 64;
//        return Arrays.copyOf(bits, bits.length + padLength);
//    }
//
//    private static int[] permute(int[] input, int[] table) {
//        int[] output = new int[table.length];
//        for (int i = 0; i < table.length; i++) {
//            output[i] = input[table[i] - 1];
//        }
//        return output;
//    }
//
//    private static int[] leftShift(int[] bits, int count) {
//        int[] shifted = new int[bits.length];
//        for (int i = 0; i < bits.length; i++) {
//            shifted[i] = bits[(i + count) % bits.length];
//        }
//        return shifted;
//    }
//
//    private static int[] xor(int[] a, int[] b) {
//        int[] output = new int[a.length];
//        for (int i = 0; i < a.length; i++) {
//            output[i] = a[i] ^ b[i];
//        }
//        return output;
//    }
//
//    private static int[] feistel(int[] r, int[] k) {
//        int[] expanded = permute(r, E);
//        int[] xored = xor(expanded, k);
//        int[] output = new int[32];
//        for (int i = 0; i < 8; i++) {
//            int row = (xored[i * 6] << 1) | xored[i * 6 + 5];
//            int col = (xored[i * 6 + 1] << 3) | (xored[i * 6 + 2] << 2) |
//                    (xored[i * 6 + 3] << 1) | xored[i * 6 + 4];
//            int val = S_BOX[i][row][col];
//            for (int j = 0; j < 4; j++) {
//                output[i * 4 + (3 - j)] = (val >> j) & 1;
//            }
//        }
//        return permute(output, P);
//    }
//
//    private static int[][] generateSubkeys(String key) {
//        int[] keyBits = stringToBits(key);
//        int[] padded = Arrays.copyOf(keyBits, 64);
//        int[] permuted = permute(padded, PC1);
//        int[] c = Arrays.copyOfRange(permuted, 0, 28);
//        int[] d = Arrays.copyOfRange(permuted, 28, 56);
//        int[][] subkeys = new int[16][];
//        for (int i = 0; i < 16; i++) {
//            c = leftShift(c, SHIFTS[i]);
//            d = leftShift(d, SHIFTS[i]);
//            int[] cd = new int[56];
//            System.arraycopy(c, 0, cd, 0, 28);
//            System.arraycopy(d, 0, cd, 28, 28);
//            subkeys[i] = permute(cd, PC2);
//        }
//        return subkeys;
//    }
//
//    private static int[] processBlock(int[] block, int[][] subkeys, boolean encrypt) {
//        block = permute(block, IP);
//        int[] l = Arrays.copyOfRange(block, 0, 32);
//        int[] r = Arrays.copyOfRange(block, 32, 64);
//        for (int i = 0; i < 16; i++) {
//            int[] temp = r;
//            int[] fOut = feistel(r, encrypt ? subkeys[i] : subkeys[15 - i]);
//            r = xor(l, fOut);
//            l = temp;
//        }
//        int[] combined = new int[64];
//        System.arraycopy(r, 0, combined, 0, 32);
//        System.arraycopy(l, 0, combined, 32, 32);
//        return permute(combined, FP);
//    }
//
//    public static String encrypt(String plainText, String key) {
//        int[] bits = stringToBits(plainText);
//        bits = padToBlock(bits);
//        int[][] subkeys = generateSubkeys(key);
//        int[] result = new int[bits.length];
//        for (int i = 0; i < bits.length; i += 64) {
//            int[] block = Arrays.copyOfRange(bits, i, i + 64);
//            int[] processed = processBlock(block, subkeys, true);
//            System.arraycopy(processed, 0, result, i, 64);
//        }
//        return bitsToHex(result);
//    }
//
//    public static String decrypt(String cipherHex, String key) {
//        int[] bits = hexToBits(cipherHex);
//        int[][] subkeys = generateSubkeys(key);
//        int[] result = new int[bits.length];
//        for (int i = 0; i < bits.length; i += 64) {
//            int[] block = Arrays.copyOfRange(bits, i, i + 64);
//            int[] processed = processBlock(block, subkeys, false);
//            System.arraycopy(processed, 0, result, i, 64);
//        }
//        return bitsToString(result).trim();
//    }
//
//    private static String bitsToHex(int[] bits) {
//        StringBuilder hex = new StringBuilder();
//        for (int i = 0; i < bits.length; i += 4) {
//            int val = 0;
//            for (int j = 0; j < 4; j++) {
//                val = (val << 1) | bits[i + j];
//            }
//            hex.append(Integer.toHexString(val));
//        }
//        return hex.toString().toUpperCase();
//    }
//
//    private static int[] hexToBits(String hex) {
//        int[] bits = new int[hex.length() * 4];
//        for (int i = 0; i < hex.length(); i++) {
//            int val = Character.digit(hex.charAt(i), 16);
//            for (int j = 0; j < 4; j++) {
//                bits[i * 4 + (3 - j)] = (val >> j) & 1;
//            }
//        }
//        return bits;
//    }
//}

import java.util.Arrays;
import java.io.UnsupportedEncodingException;

public class DES {
    private static final int[] IP = {
            58, 50, 42, 34, 26, 18, 10, 2,
            60, 52, 44, 36, 28, 20, 12, 4,
            62, 54, 46, 38, 30, 22, 14, 6,
            64, 56, 48, 40, 32, 24, 16, 8,
            57, 49, 41, 33, 25, 17, 9, 1,
            59, 51, 43, 35, 27, 19, 11, 3,
            61, 53, 45, 37, 29, 21, 13, 5,
            63, 55, 47, 39, 31, 23, 15, 7
    };

    private static final int[] FP = {
            40, 8, 48, 16, 56, 24, 64, 32,
            39, 7, 47, 15, 55, 23, 63, 31,
            38, 6, 46, 14, 54, 22, 62, 30,
            37, 5, 45, 13, 53, 21, 61, 29,
            36, 4, 44, 12, 52, 20, 60, 28,
            35, 3, 43, 11, 51, 19, 59, 27,
            34, 2, 42, 10, 50, 18, 58, 26,
            33, 1, 41, 9, 49, 17, 57, 25
    };

    private static final int[] E = {
            32, 1, 2, 3, 4, 5,
            4, 5, 6, 7, 8, 9,
            8, 9, 10, 11, 12, 13,
            12, 13, 14, 15, 16, 17,
            16, 17, 18, 19, 20, 21,
            20, 21, 22, 23, 24, 25,
            24, 25, 26, 27, 28, 29,
            28, 29, 30, 31, 32, 1
    };

    private static final int[][][] S_BOX = {
            {
                    {14,4,13,1,2,15,11,8,3,10,6,12,5,9,0,7},
                    {0,15,7,4,14,2,13,1,10,6,12,11,9,5,3,8},
                    {4,1,14,8,13,6,2,11,15,12,9,7,3,10,5,0},
                    {15,12,8,2,4,9,1,7,5,11,3,14,10,0,6,13}
            },
            {
                    {15,1,8,14,6,11,3,4,9,7,2,13,12,0,5,10},
                    {3,13,4,7,15,2,8,14,12,0,1,10,6,9,11,5},
                    {0,14,7,11,10,4,13,1,5,8,12,6,9,3,2,15},
                    {13,8,10,1,3,15,4,2,11,6,7,12,0,5,14,9}
            },
            {
                    {10,0,9,14,6,3,15,5,1,13,12,7,11,4,2,8},
                    {13,7,0,9,3,4,6,10,2,8,5,14,12,11,15,1},
                    {13,6,4,9,8,15,3,0,11,1,2,12,5,10,14,7},
                    {1,10,13,0,6,9,8,7,4,15,14,3,11,5,2,12}
            },
            {
                    {7,13,14,3,0,6,9,10,1,2,8,5,11,12,4,15},
                    {13,8,11,5,6,15,0,3,4,7,2,12,1,10,14,9},
                    {10,6,9,0,12,11,7,13,15,1,3,14,5,2,8,4},
                    {3,15,0,6,10,1,13,8,9,4,5,11,12,7,2,14}
            },
            {
                    {2,12,4,1,7,10,11,6,8,5,3,15,13,0,14,9},
                    {14,11,2,12,4,7,13,1,5,0,15,10,3,9,8,6},
                    {4,2,1,11,10,13,7,8,15,9,12,5,6,3,0,14},
                    {11,8,12,7,1,14,2,13,6,15,0,9,10,4,5,3}
            },
            {
                    {12,1,10,15,9,2,6,8,0,13,3,4,14,7,5,11},
                    {10,15,4,2,7,12,9,5,6,1,13,14,0,11,3,8},
                    {9,14,15,5,2,8,12,3,7,0,4,10,1,13,11,6},
                    {4,3,2,12,9,5,15,10,11,14,1,7,6,0,8,13}
            },
            {
                    {4,11,2,14,15,0,8,13,3,12,9,7,5,10,6,1},
                    {13,0,11,7,4,9,1,10,14,3,5,12,2,15,8,6},
                    {1,4,11,13,12,3,7,14,10,15,6,8,0,5,9,2},
                    {6,11,13,8,1,4,10,7,9,5,0,15,14,2,3,12}
            },
            {
                    {13,2,8,4,6,15,11,1,10,9,3,14,5,0,12,7},
                    {1,15,13,8,10,3,7,4,12,5,6,11,0,14,9,2},
                    {7,11,4,1,9,12,14,2,0,6,10,13,15,3,5,8},
                    {2,1,14,7,4,10,8,13,15,12,9,0,3,5,6,11}
            }
    };

    private static final int[] P = {
            16, 7, 20, 21, 29, 12, 28, 17,
            1, 15, 23, 26, 5, 18, 31, 10,
            2, 8, 24, 14, 32, 27, 3, 9,
            19, 13, 30, 6, 22, 11, 4, 25
    };

    private static final int[] PC1 = {
            57, 49, 41, 33, 25, 17, 9,
            1, 58, 50, 42, 34, 26, 18,
            10, 2, 59, 51, 43, 35, 27,
            19, 11, 3, 60, 52, 44, 36,
            63, 55, 47, 39, 31, 23, 15,
            7, 62, 54, 46, 38, 30, 22,
            14, 6, 61, 53, 45, 37, 29,
            21, 13, 5, 28, 20, 12, 4
    };

    private static final int[] PC2 = {
            14, 17, 11, 24, 1, 5,
            3, 28, 15, 6, 21, 10,
            23, 19, 12, 4, 26, 8,
            16, 7, 27, 20, 13, 2,
            41, 52, 31, 37, 47, 55,
            30, 40, 51, 45, 33, 48,
            44, 49, 39, 56, 34, 53,
            46, 42, 50, 36, 29, 32
    };

    private static final int[] SHIFTS = {
            1, 1, 2, 2, 2, 2, 2, 2,
            1, 2, 2, 2, 2, 2, 2, 1
    };

    // FIXED: Validate và normalize key thành 8 bytes
    private static byte[] validateAndNormalizeKey(String key) throws IllegalArgumentException {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        
        try {
            byte[] keyBytes = key.getBytes("UTF-8");
            
            // DES yêu cầu key chính xác 8 bytes
            if (keyBytes.length > 8) {
                throw new IllegalArgumentException("Key too long. DES requires exactly 8 bytes key");
            }
            
            if (keyBytes.length < 8) {
                throw new IllegalArgumentException("Key too short. DES requires exactly 8 bytes key. Current length: " + keyBytes.length);
            }
            
            return keyBytes;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 encoding not supported: " + e.getMessage());
        }
    }

    // FIXED: PKCS#7 Padding
    private static byte[] addPKCS7Padding(byte[] data) {
        int blockSize = 8; // DES block size là 8 bytes
        int padLength = blockSize - (data.length % blockSize);
        
        byte[] padded = new byte[data.length + padLength];
        System.arraycopy(data, 0, padded, 0, data.length);
        
        // PKCS#7: pad với giá trị = số bytes cần pad
        for (int i = data.length; i < padded.length; i++) {
            padded[i] = (byte) padLength;
        }
        
        return padded;
    }

    // FIXED: Remove PKCS#7 Padding
    private static byte[] removePKCS7Padding(byte[] data) throws IllegalArgumentException {
        if (data.length == 0) {
            throw new IllegalArgumentException("Cannot remove padding from empty data");
        }
        
        int padLength = data[data.length - 1] & 0xFF;
        
        // Validate padding
        if (padLength < 1 || padLength > 8) {
            throw new IllegalArgumentException("Invalid padding length: " + padLength);
        }
        
        if (padLength > data.length) {
            throw new IllegalArgumentException("Padding length exceeds data length");
        }
        
        // Kiểm tra tất cả padding bytes có đúng giá trị không
        for (int i = data.length - padLength; i < data.length; i++) {
            if ((data[i] & 0xFF) != padLength) {
                throw new IllegalArgumentException("Invalid padding bytes");
            }
        }
        
        return Arrays.copyOf(data, data.length - padLength);
    }

    private static int[] bytesToBits(byte[] bytes) {
        int[] bits = new int[bytes.length * 8];
        for (int i = 0; i < bytes.length; i++) {
            int val = bytes[i] & 0xFF;
            for (int j = 0; j < 8; j++) {
                bits[i * 8 + (7 - j)] = (val >> j) & 1;
            }
        }
        return bits;
    }

    private static byte[] bitsToBytes(int[] bits) {
        byte[] bytes = new byte[bits.length / 8];
        for (int i = 0; i < bytes.length; i++) {
            int val = 0;
            for (int j = 0; j < 8; j++) {
                val = (val << 1) | bits[i * 8 + j];
            }
            bytes[i] = (byte) val;
        }
        return bytes;
    }

    private static int[] permute(int[] input, int[] table) {
        int[] output = new int[table.length];
        for (int i = 0; i < table.length; i++) {
            output[i] = input[table[i] - 1];
        }
        return output;
    }

    private static int[] leftShift(int[] bits, int count) {
        int[] shifted = new int[bits.length];
        for (int i = 0; i < bits.length; i++) {
            shifted[i] = bits[(i + count) % bits.length];
        }
        return shifted;
    }

    private static int[] xor(int[] a, int[] b) {
        int[] output = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            output[i] = a[i] ^ b[i];
        }
        return output;
    }

    private static int[] feistel(int[] r, int[] k) {
        int[] expanded = permute(r, E);
        int[] xored = xor(expanded, k);
        int[] output = new int[32];
        for (int i = 0; i < 8; i++) {
            int row = (xored[i * 6] << 1) | xored[i * 6 + 5];
            int col = (xored[i * 6 + 1] << 3) | (xored[i * 6 + 2] << 2) |
                    (xored[i * 6 + 3] << 1) | xored[i * 6 + 4];
            int val = S_BOX[i][row][col];
            for (int j = 0; j < 4; j++) {
                output[i * 4 + (3 - j)] = (val >> j) & 1;
            }
        }
        return permute(output, P);
    }

    private static int[][] generateSubkeys(byte[] keyBytes) {
        int[] keyBits = bytesToBits(keyBytes);
        int[] permuted = permute(keyBits, PC1);
        int[] c = Arrays.copyOfRange(permuted, 0, 28);
        int[] d = Arrays.copyOfRange(permuted, 28, 56);
        int[][] subkeys = new int[16][];
        for (int i = 0; i < 16; i++) {
            c = leftShift(c, SHIFTS[i]);
            d = leftShift(d, SHIFTS[i]);
            int[] cd = new int[56];
            System.arraycopy(c, 0, cd, 0, 28);
            System.arraycopy(d, 0, cd, 28, 28);
            subkeys[i] = permute(cd, PC2);
        }
        return subkeys;
    }

    private static int[] processBlock(int[] block, int[][] subkeys, boolean encrypt) {
        block = permute(block, IP);
        int[] l = Arrays.copyOfRange(block, 0, 32);
        int[] r = Arrays.copyOfRange(block, 32, 64);
        for (int i = 0; i < 16; i++) {
            int[] temp = r;
            int[] fOut = feistel(r, encrypt ? subkeys[i] : subkeys[15 - i]);
            r = xor(l, fOut);
            l = temp;
        }
        int[] combined = new int[64];
        System.arraycopy(r, 0, combined, 0, 32);
        System.arraycopy(l, 0, combined, 32, 32);
        return permute(combined, FP);
    }

    public static String encrypt(String plainText, String key) throws IllegalArgumentException {
        if (plainText == null) {
            throw new IllegalArgumentException("Plaintext cannot be null");
        }
        
        try {
            // Validate key
            byte[] keyBytes = validateAndNormalizeKey(key);
            
            // Convert plaintext to bytes và add PKCS#7 padding
            byte[] plainBytes = plainText.getBytes("UTF-8");
            byte[] paddedBytes = addPKCS7Padding(plainBytes);
            
            // Convert to bits
            int[] bits = bytesToBits(paddedBytes);
            int[][] subkeys = generateSubkeys(keyBytes);
            int[] result = new int[bits.length];
            
            // Process mỗi block 64-bit
            for (int i = 0; i < bits.length; i += 64) {
                int[] block = Arrays.copyOfRange(bits, i, i + 64);
                int[] processed = processBlock(block, subkeys, true);
                System.arraycopy(processed, 0, result, i, 64);
            }
            
            return bitsToHex(result);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 encoding not supported: " + e.getMessage());
        }
    }

    public static String decrypt(String cipherHex, String key) throws IllegalArgumentException {
        if (cipherHex == null) {
            throw new IllegalArgumentException("Cipher text cannot be null");
        }
        
        try {
            // Validate key
            byte[] keyBytes = validateAndNormalizeKey(key);
            
            // Convert hex to bits
            int[] bits = hexToBits(cipherHex);
            int[][] subkeys = generateSubkeys(keyBytes);
            int[] result = new int[bits.length];
            
            // Process mỗi block 64-bit
            for (int i = 0; i < bits.length; i += 64) {
                int[] block = Arrays.copyOfRange(bits, i, i + 64);
                int[] processed = processBlock(block, subkeys, false);
                System.arraycopy(processed, 0, result, i, 64);
            }
            
            // Convert bits to bytes
            byte[] decryptedBytes = bitsToBytes(result);
            
            // Remove PKCS#7 padding
            byte[] unpaddedBytes = removePKCS7Padding(decryptedBytes);
            
            return new String(unpaddedBytes, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 encoding not supported: " + e.getMessage());
        }
    }

    private static String bitsToHex(int[] bits) {
        StringBuilder hex = new StringBuilder();
        for (int i = 0; i < bits.length; i += 4) {
            int val = 0;
            for (int j = 0; j < 4; j++) {
                val = (val << 1) | bits[i + j];
            }
            hex.append(Integer.toHexString(val));
        }
        return hex.toString().toUpperCase();
    }

    private static int[] hexToBits(String hex) {
        int[] bits = new int[hex.length() * 4];
        for (int i = 0; i < hex.length(); i++) {
            int val = Character.digit(hex.charAt(i), 16);
            for (int j = 0; j < 4; j++) {
                bits[i * 4 + (3 - j)] = (val >> j) & 1;
            }
        }
        return bits;
    }

    // Test method
    public static void main(String[] args) {
        try {
            String key = "YELLOW12"; // Chính xác 8 bytes
            String plaintext = "Hello World! This is a test message.";
            
            System.out.println("Original: " + plaintext);
            
            String encrypted = encrypt(plaintext, key);
            System.out.println("Encrypted: " + encrypted);
            
            String decrypted = decrypt(encrypted, key);
            System.out.println("Decrypted: " + decrypted);
            
            System.out.println("Match: " + plaintext.equals(decrypted));
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}