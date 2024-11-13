package dev.octoshrimpy.quik.blocking;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CallBlockerBlockingClient_Factory implements Factory<CallBlockerBlockingClient> {
  private final Provider<Context> contextProvider;

  public CallBlockerBlockingClient_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public CallBlockerBlockingClient get() {
    return provideInstance(contextProvider);
  }

  public static CallBlockerBlockingClient provideInstance(Provider<Context> contextProvider) {
    return new CallBlockerBlockingClient(contextProvider.get());
  }

  public static CallBlockerBlockingClient_Factory create(Provider<Context> contextProvider) {
    return new CallBlockerBlockingClient_Factory(contextProvider);
  }

  public static CallBlockerBlockingClient newCallBlockerBlockingClient(Context context) {
    return new CallBlockerBlockingClient(context);
  }
}
