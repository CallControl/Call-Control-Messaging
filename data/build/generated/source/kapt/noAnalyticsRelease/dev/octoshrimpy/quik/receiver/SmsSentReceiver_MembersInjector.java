package dev.octoshrimpy.quik.receiver;

import dagger.MembersInjector;
import dev.octoshrimpy.quik.interactor.MarkFailed;
import dev.octoshrimpy.quik.interactor.MarkSent;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SmsSentReceiver_MembersInjector implements MembersInjector<SmsSentReceiver> {
  private final Provider<MarkSent> markSentProvider;

  private final Provider<MarkFailed> markFailedProvider;

  public SmsSentReceiver_MembersInjector(
      Provider<MarkSent> markSentProvider, Provider<MarkFailed> markFailedProvider) {
    this.markSentProvider = markSentProvider;
    this.markFailedProvider = markFailedProvider;
  }

  public static MembersInjector<SmsSentReceiver> create(
      Provider<MarkSent> markSentProvider, Provider<MarkFailed> markFailedProvider) {
    return new SmsSentReceiver_MembersInjector(markSentProvider, markFailedProvider);
  }

  @Override
  public void injectMembers(SmsSentReceiver instance) {
    injectMarkSent(instance, markSentProvider.get());
    injectMarkFailed(instance, markFailedProvider.get());
  }

  public static void injectMarkSent(SmsSentReceiver instance, MarkSent markSent) {
    instance.markSent = markSent;
  }

  public static void injectMarkFailed(SmsSentReceiver instance, MarkFailed markFailed) {
    instance.markFailed = markFailed;
  }
}
