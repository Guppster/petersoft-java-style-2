package com.petersoft;

import java.io.File;
import java.io.RandomAccessFile;

public class CommonLib {
	public static byte[] readFileByte(File file, long offset, int size) {
		return readFileByte(file.getAbsolutePath(), offset, size);
	}

	public static byte[] readFileByte(String filepath, long offset, int size) {
		try {
			RandomAccessFile br = new RandomAccessFile(filepath, "r");
			br.seek(offset);
			byte bytes[] = new byte[size];
			br.readFully(bytes);
			br.close();
			return bytes;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public static Long string2decimal(String s) {
		s = s.trim().toLowerCase();
		if (s.startsWith("0x")) {
			return Long.parseLong(s.substring(2), 16);
		} else {
			return Long.parseLong(s, 10);
		}
	}

	public static long convertFilesize(String filesize) {
		if (filesize.length() == 0) {
			return 0;
		} else if (filesize.length() == 1) {
			return Long.parseLong(filesize);
		} else if (filesize.substring(filesize.length() - 1).toLowerCase().equals("t")) {
			try {
				return Long.parseLong(filesize.substring(0, filesize.length() - 1)) * 1024 * 1024 * 1024 * 1024;
			} catch (Exception ex) {
				return -1;
			}
		} else if (filesize.substring(filesize.length() - 2).toLowerCase().equals("tb")) {
			try {
				return Long.parseLong(filesize.substring(0, filesize.length() - 2)) * 1024 * 1024 * 1024 * 1024;
			} catch (Exception ex) {
				return -1;
			}
		} else if (filesize.substring(filesize.length() - 1).toLowerCase().equals("g")) {
			try {
				return Long.parseLong(filesize.substring(0, filesize.length() - 1)) * 1024 * 1024 * 1024;
			} catch (Exception ex) {
				return -1;
			}
		} else if (filesize.substring(filesize.length() - 2).toLowerCase().equals("gb")) {
			try {
				return Long.parseLong(filesize.substring(0, filesize.length() - 2)) * 1024 * 1024 * 1024;
			} catch (Exception ex) {
				return -1;
			}
		} else if (filesize.substring(filesize.length() - 1).toLowerCase().equals("m")) {
			try {
				return Long.parseLong(filesize.substring(0, filesize.length() - 1)) * 1024 * 1024;
			} catch (Exception ex) {
				return -1;
			}
		} else if (filesize.substring(filesize.length() - 2).toLowerCase().equals("mb")) {
			try {
				return Long.parseLong(filesize.substring(0, filesize.length() - 2)) * 1024 * 1024;
			} catch (Exception ex) {
				return -1;
			}
		} else if (filesize.substring(filesize.length() - 1).toLowerCase().equals("k")) {
			try {
				return Long.parseLong(filesize.substring(0, filesize.length() - 1)) * 1024;
			} catch (Exception ex) {
				return -1;
			}
		} else if (filesize.substring(filesize.length() - 2).toLowerCase().equals("kb")) {
			try {
				return Long.parseLong(filesize.substring(0, filesize.length() - 2)) * 1024;
			} catch (Exception ex) {
				return -1;
			}
		} else {
			try {
				return Long.parseLong(filesize);
			} catch (Exception ex) {
				return -1;
			}
		}
	}

}
