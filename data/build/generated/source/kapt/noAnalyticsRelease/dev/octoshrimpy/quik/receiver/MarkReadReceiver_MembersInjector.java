package dev.octoshrimpy.quik.receiver;

import dagger.MembersInjector;
import dev.octoshrimpy.quik.interactor.MarkRead;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MarkReadReceiver_MembersInjector implements MembersInjector<MarkReadReceiver> {
  private final Provider<MarkRead> markReadProvider;

  public MarkReadReceiver_MembersInjector(Provider<MarkRead> markReadProvider) {
    this.markReadProvider = markReadProvider;
  }

  public static MembersInjector<MarkReadReceiver> create(Provider<MarkRead> markReadProvider) {
    return new MarkReadReceiver_MembersInjector(markReadProvider);
  }

  @Override
  public void injectMembers(MarkReadReceiver instance) {
    injectMarkRead(instance, markReadProvider.get());
  }

  public static void injectMarkRead(MarkReadReceiver instance, MarkRead markRead) {
    instance.markRead = markRead;
  }
}
