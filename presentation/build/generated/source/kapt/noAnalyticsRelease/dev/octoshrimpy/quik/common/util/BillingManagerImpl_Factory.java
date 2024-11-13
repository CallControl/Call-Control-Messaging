package dev.octoshrimpy.quik.common.util;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BillingManagerImpl_Factory implements Factory<BillingManagerImpl> {
  private static final BillingManagerImpl_Factory INSTANCE = new BillingManagerImpl_Factory();

  @Override
  public BillingManagerImpl get() {
    return provideInstance();
  }

  public static BillingManagerImpl provideInstance() {
    return new BillingManagerImpl();
  }

  public static BillingManagerImpl_Factory create() {
    return INSTANCE;
  }

  public static BillingManagerImpl newBillingManagerImpl() {
    return new BillingManagerImpl();
  }
}
