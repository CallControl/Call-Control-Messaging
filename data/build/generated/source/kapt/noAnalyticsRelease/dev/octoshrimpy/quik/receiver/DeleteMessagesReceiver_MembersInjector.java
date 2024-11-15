package dev.octoshrimpy.quik.receiver;

import dagger.MembersInjector;
import dev.octoshrimpy.quik.interactor.DeleteMessages;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DeleteMessagesReceiver_MembersInjector
    implements MembersInjector<DeleteMessagesReceiver> {
  private final Provider<DeleteMessages> deleteMessagesProvider;

  public DeleteMessagesReceiver_MembersInjector(Provider<DeleteMessages> deleteMessagesProvider) {
    this.deleteMessagesProvider = deleteMessagesProvider;
  }

  public static MembersInjector<DeleteMessagesReceiver> create(
      Provider<DeleteMessages> deleteMessagesProvider) {
    return new DeleteMessagesReceiver_MembersInjector(deleteMessagesProvider);
  }

  @Override
  public void injectMembers(DeleteMessagesReceiver instance) {
    injectDeleteMessages(instance, deleteMessagesProvider.get());
  }

  public static void injectDeleteMessages(
      DeleteMessagesReceiver instance, DeleteMessages deleteMessages) {
    instance.deleteMessages = deleteMessages;
  }
}
