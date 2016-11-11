package com.kpfu.itis.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by aleksandrpliskin on 11.11.16.
 */
public class LowerCaseInputStream extends FilterInputStream {

  private int field;

  protected LowerCaseInputStream(InputStream in) {
    super(in);
  }

  @Override
  public int read() throws IOException {
    int c = super.read();
    return c == -1 ? -1 : Character.toLowerCase(c);
  }

//  @Override
//  public int read(byte[] b, int off, int len) throws IOException {
//    return super.read(b, off, len);
//  }
}
