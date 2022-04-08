package com.oneklickshop.api.response;

import com.oneklickshop.exceptions.InvalidResponseException;
import com.oneklickshop.model.Forbidden;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * UserResponse abstract class implements the ResponseMarker which defines the response type.
 *
 * <p>It helps in abstracting User Model response.
 *
 * @author Jagdeep Jain
 */
public abstract class ForbiddenResponse implements ResponseMarker {
  final Logger log = LogManager.getLogger(this.getClass());
  private Response response;

  public abstract Forbidden getForbiddenMessage() throws InvalidResponseException;

  public Response getResponse() {
    return this.response;
  }

  public ForbiddenResponse setResponse(Response response) {
    this.response = response;
    return this;
  }
}
