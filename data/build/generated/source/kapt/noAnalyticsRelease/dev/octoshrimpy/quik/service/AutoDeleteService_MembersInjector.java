package dev.octoshrimpy.quik.service;

import dagger.MembersInjector;
import dev.octoshrimpy.quik.interactor.DeleteOldMessages;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AutoDeleteService_MembersInjector implements MembersInjector<AutoDeleteService> {
  private final Provider<DeleteOldMessages> deleteOldMessagesProvider;

  public AutoDeleteService_MembersInjector(Provider<DeleteOldMessages> deleteOldMessagesProvider) {
    this.deleteOldMessagesProvider = deleteOldMessagesProvider;
  }

  public static MembersInjector<AutoDeleteService> create(
      Provider<DeleteOldMessages> deleteOldMessagesProvider) {
    return new AutoDeleteService_MembersInjector(deleteOldMessagesProvider);
  }

  @Override
  public void injectMembers(AutoDeleteService instance) {
    injectDeleteOldMessages(instance, deleteOldMessagesProvider.get());
  }

  public static void injectDeleteOldMessages(
      AutoDeleteService instance, DeleteOldMessages deleteOldMessages) {
    instance.deleteOldMessages = deleteOldMessages;
  }
}
