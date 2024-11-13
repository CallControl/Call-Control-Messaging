package dev.octoshrimpy.quik.feature.blocking;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.blocking.BlockingClient;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BlockingPresenter_Factory implements Factory<BlockingPresenter> {
  private final Provider<Context> contextProvider;

  private final Provider<BlockingClient> blockingClientProvider;

  private final Provider<Preferences> prefsProvider;

  public BlockingPresenter_Factory(
      Provider<Context> contextProvider,
      Provider<BlockingClient> blockingClientProvider,
      Provider<Preferences> prefsProvider) {
    this.contextProvider = contextProvider;
    this.blockingClientProvider = blockingClientProvider;
    this.prefsProvider = prefsProvider;
  }

  @Override
  public BlockingPresenter get() {
    return provideInstance(contextProvider, blockingClientProvider, prefsProvider);
  }

  public static BlockingPresenter provideInstance(
      Provider<Context> contextProvider,
      Provider<BlockingClient> blockingClientProvider,
      Provider<Preferences> prefsProvider) {
    return new BlockingPresenter(
        contextProvider.get(), blockingClientProvider.get(), prefsProvider.get());
  }

  public static BlockingPresenter_Factory create(
      Provider<Context> contextProvider,
      Provider<BlockingClient> blockingClientProvider,
      Provider<Preferences> prefsProvider) {
    return new BlockingPresenter_Factory(contextProvider, blockingClientProvider, prefsProvider);
  }

  public static BlockingPresenter newBlockingPresenter(
      Context context, BlockingClient blockingClient, Preferences prefs) {
    return new BlockingPresenter(context, blockingClient, prefs);
  }
}
