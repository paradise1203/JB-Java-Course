package com.my.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by aleksandrpliskin on 09.11.16.
 */
public class UpperCaseInputStream extends FilterInputStream {

  public UpperCaseInputStream(InputStream inputStream) {
    super(inputStream);
  }

  @Override
  public int read() throws IOException {
    int c = super.read();
    return c == -1 ? c : Character.toUpperCase(c);
  }

  @Override
  public int read(byte[] b, int off, int len) throws IOException {
    int result = super.read(b, off, len);
    for (int i = off; i < off + result; i++) {
      b[i] = (byte) Character.toUpperCase(b[i]);
    }
    return result;
  }
}
