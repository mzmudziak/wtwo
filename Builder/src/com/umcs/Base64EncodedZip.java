package com.umcs;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Base64;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Base64EncodedZip {
  static public String encode(int[] input) throws IOException {
    ByteBuffer byteBuffer = ByteBuffer.allocate(input.length * 10);
    IntBuffer intBuffer = byteBuffer.asIntBuffer();
    intBuffer.put(input);

    byte[] array = byteBuffer.array();
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ZipOutputStream zos = new ZipOutputStream(baos);
    ZipEntry entry = new ZipEntry("plik.encode");
    entry.setSize(array.length);
    zos.putNextEntry(entry);
    zos.write(array);
    zos.closeEntry();
    zos.close();
    return new String(Base64.getEncoder().encode(baos.toByteArray()));
  }
}
