package uk.gov.ons.fwmt.census.common.retry;

import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.retry.interceptor.MethodInvocationRecoverer;

public class GatewayMessageRecover implements MethodInvocationRecoverer<Void> {

  @Override
  public Void recover(Object[] args, Throwable cause) {
    throw new AmqpRejectAndDontRequeueException(cause);
  }
}
