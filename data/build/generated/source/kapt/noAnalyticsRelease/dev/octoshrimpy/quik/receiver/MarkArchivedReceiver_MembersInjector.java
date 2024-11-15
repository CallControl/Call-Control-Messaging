package dev.octoshrimpy.quik.receiver;

import dagger.MembersInjector;
import dev.octoshrimpy.quik.interactor.MarkArchived;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MarkArchivedReceiver_MembersInjector
    implements MembersInjector<MarkArchivedReceiver> {
  private final Provider<MarkArchived> markArchivedProvider;

  public MarkArchivedReceiver_MembersInjector(Provider<MarkArchived> markArchivedProvider) {
    this.markArchivedProvider = markArchivedProvider;
  }

  public static MembersInjector<MarkArchivedReceiver> create(
      Provider<MarkArchived> markArchivedProvider) {
    return new MarkArchivedReceiver_MembersInjector(markArchivedProvider);
  }

  @Override
  public void injectMembers(MarkArchivedReceiver instance) {
    injectMarkArchived(instance, markArchivedProvider.get());
  }

  public static void injectMarkArchived(MarkArchivedReceiver instance, MarkArchived markArchived) {
    instance.markArchived = markArchived;
  }
}
