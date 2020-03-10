package com.kodekonveyor.exception;

import com.kodekonveyor.annotations.ExcludeFromCodeCoverage;

@ExcludeFromCodeCoverage("exception")
public class ValidationException extends RuntimeException {

  private static final long serialVersionUID = -8212637432988384773L;

  public ValidationException(final String nullOwnerId) {
    super(nullOwnerId);
  }
}
