package dev.octoshrimpy.quik.blocking;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.repository.BlockingRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QksmsBlockingClient_Factory implements Factory<QksmsBlockingClient> {
  private final Provider<BlockingRepository> blockingRepoProvider;

  public QksmsBlockingClient_Factory(Provider<BlockingRepository> blockingRepoProvider) {
    this.blockingRepoProvider = blockingRepoProvider;
  }

  @Override
  public QksmsBlockingClient get() {
    return provideInstance(blockingRepoProvider);
  }

  public static QksmsBlockingClient provideInstance(
      Provider<BlockingRepository> blockingRepoProvider) {
    return new QksmsBlockingClient(blockingRepoProvider.get());
  }

  public static QksmsBlockingClient_Factory create(
      Provider<BlockingRepository> blockingRepoProvider) {
    return new QksmsBlockingClient_Factory(blockingRepoProvider);
  }

  public static QksmsBlockingClient newQksmsBlockingClient(BlockingRepository blockingRepo) {
    return new QksmsBlockingClient(blockingRepo);
  }
}
