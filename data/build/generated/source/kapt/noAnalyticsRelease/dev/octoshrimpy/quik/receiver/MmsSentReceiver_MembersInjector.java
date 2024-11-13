package dev.octoshrimpy.quik.receiver;

import dagger.MembersInjector;
import dev.octoshrimpy.quik.interactor.SyncMessage;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MmsSentReceiver_MembersInjector implements MembersInjector<MmsSentReceiver> {
  private final Provider<SyncMessage> syncMessageProvider;

  public MmsSentReceiver_MembersInjector(Provider<SyncMessage> syncMessageProvider) {
    this.syncMessageProvider = syncMessageProvider;
  }

  public static MembersInjector<MmsSentReceiver> create(Provider<SyncMessage> syncMessageProvider) {
    return new MmsSentReceiver_MembersInjector(syncMessageProvider);
  }

  @Override
  public void injectMembers(MmsSentReceiver instance) {
    injectSyncMessage(instance, syncMessageProvider.get());
  }

  public static void injectSyncMessage(MmsSentReceiver instance, SyncMessage syncMessage) {
    instance.syncMessage = syncMessage;
  }
}
