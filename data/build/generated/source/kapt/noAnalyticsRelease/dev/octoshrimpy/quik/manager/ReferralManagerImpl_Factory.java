package dev.octoshrimpy.quik.manager;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ReferralManagerImpl_Factory implements Factory<ReferralManagerImpl> {
  private static final ReferralManagerImpl_Factory INSTANCE = new ReferralManagerImpl_Factory();

  @Override
  public ReferralManagerImpl get() {
    return provideInstance();
  }

  public static ReferralManagerImpl provideInstance() {
    return new ReferralManagerImpl();
  }

  public static ReferralManagerImpl_Factory create() {
    return INSTANCE;
  }

  public static ReferralManagerImpl newReferralManagerImpl() {
    return new ReferralManagerImpl();
  }
}
