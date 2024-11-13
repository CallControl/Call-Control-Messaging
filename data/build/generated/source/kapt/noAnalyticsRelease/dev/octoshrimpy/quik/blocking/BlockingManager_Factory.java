package dev.octoshrimpy.quik.blocking;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BlockingManager_Factory implements Factory<BlockingManager> {
  private final Provider<Preferences> prefsProvider;

  private final Provider<CallBlockerBlockingClient> callBlockerBlockingClientProvider;

  private final Provider<CallControlBlockingClient> callControlBlockingClientProvider;

  private final Provider<QksmsBlockingClient> qksmsBlockingClientProvider;

  private final Provider<ShouldIAnswerBlockingClient> shouldIAnswerBlockingClientProvider;

  public BlockingManager_Factory(
      Provider<Preferences> prefsProvider,
      Provider<CallBlockerBlockingClient> callBlockerBlockingClientProvider,
      Provider<CallControlBlockingClient> callControlBlockingClientProvider,
      Provider<QksmsBlockingClient> qksmsBlockingClientProvider,
      Provider<ShouldIAnswerBlockingClient> shouldIAnswerBlockingClientProvider) {
    this.prefsProvider = prefsProvider;
    this.callBlockerBlockingClientProvider = callBlockerBlockingClientProvider;
    this.callControlBlockingClientProvider = callControlBlockingClientProvider;
    this.qksmsBlockingClientProvider = qksmsBlockingClientProvider;
    this.shouldIAnswerBlockingClientProvider = shouldIAnswerBlockingClientProvider;
  }

  @Override
  public BlockingManager get() {
    return provideInstance(
        prefsProvider,
        callBlockerBlockingClientProvider,
        callControlBlockingClientProvider,
        qksmsBlockingClientProvider,
        shouldIAnswerBlockingClientProvider);
  }

  public static BlockingManager provideInstance(
      Provider<Preferences> prefsProvider,
      Provider<CallBlockerBlockingClient> callBlockerBlockingClientProvider,
      Provider<CallControlBlockingClient> callControlBlockingClientProvider,
      Provider<QksmsBlockingClient> qksmsBlockingClientProvider,
      Provider<ShouldIAnswerBlockingClient> shouldIAnswerBlockingClientProvider) {
    return new BlockingManager(
        prefsProvider.get(),
        callBlockerBlockingClientProvider.get(),
        callControlBlockingClientProvider.get(),
        qksmsBlockingClientProvider.get(),
        shouldIAnswerBlockingClientProvider.get());
  }

  public static BlockingManager_Factory create(
      Provider<Preferences> prefsProvider,
      Provider<CallBlockerBlockingClient> callBlockerBlockingClientProvider,
      Provider<CallControlBlockingClient> callControlBlockingClientProvider,
      Provider<QksmsBlockingClient> qksmsBlockingClientProvider,
      Provider<ShouldIAnswerBlockingClient> shouldIAnswerBlockingClientProvider) {
    return new BlockingManager_Factory(
        prefsProvider,
        callBlockerBlockingClientProvider,
        callControlBlockingClientProvider,
        qksmsBlockingClientProvider,
        shouldIAnswerBlockingClientProvider);
  }

  public static BlockingManager newBlockingManager(
      Preferences prefs,
      CallBlockerBlockingClient callBlockerBlockingClient,
      CallControlBlockingClient callControlBlockingClient,
      QksmsBlockingClient qksmsBlockingClient,
      ShouldIAnswerBlockingClient shouldIAnswerBlockingClient) {
    return new BlockingManager(
        prefs,
        callBlockerBlockingClient,
        callControlBlockingClient,
        qksmsBlockingClient,
        shouldIAnswerBlockingClient);
  }
}
