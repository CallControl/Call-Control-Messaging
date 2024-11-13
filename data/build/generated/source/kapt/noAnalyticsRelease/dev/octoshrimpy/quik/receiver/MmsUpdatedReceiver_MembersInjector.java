package dev.octoshrimpy.quik.receiver;

import dagger.MembersInjector;
import dev.octoshrimpy.quik.interactor.SyncMessage;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MmsUpdatedReceiver_MembersInjector
    implements MembersInjector<MmsUpdatedReceiver> {
  private final Provider<SyncMessage> syncMessageProvider;

  public MmsUpdatedReceiver_MembersInjector(Provider<SyncMessage> syncMessageProvider) {
    this.syncMessageProvider = syncMessageProvider;
  }

  public static MembersInjector<MmsUpdatedReceiver> create(
      Provider<SyncMessage> syncMessageProvider) {
    return new MmsUpdatedReceiver_MembersInjector(syncMessageProvider);
  }

  @Override
  public void injectMembers(MmsUpdatedReceiver instance) {
    injectSyncMessage(instance, syncMessageProvider.get());
  }

  public static void injectSyncMessage(MmsUpdatedReceiver instance, SyncMessage syncMessage) {
    instance.syncMessage = syncMessage;
  }
}
