package dev.octoshrimpy.quik.feature.compose;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.common.Navigator;
import dev.octoshrimpy.quik.common.util.MessageDetailsFormatter;
import dev.octoshrimpy.quik.compat.SubscriptionManagerCompat;
import dev.octoshrimpy.quik.interactor.AddScheduledMessage;
import dev.octoshrimpy.quik.interactor.CancelDelayedMessage;
import dev.octoshrimpy.quik.interactor.DeleteMessages;
import dev.octoshrimpy.quik.interactor.MarkRead;
import dev.octoshrimpy.quik.interactor.RetrySending;
import dev.octoshrimpy.quik.interactor.SendMessage;
import dev.octoshrimpy.quik.manager.ActiveConversationManager;
import dev.octoshrimpy.quik.manager.BillingManager;
import dev.octoshrimpy.quik.manager.PermissionManager;
import dev.octoshrimpy.quik.model.Attachments;
import dev.octoshrimpy.quik.repository.ContactRepository;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import dev.octoshrimpy.quik.repository.MessageRepository;
import dev.octoshrimpy.quik.util.PhoneNumberUtils;
import dev.octoshrimpy.quik.util.Preferences;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ComposeViewModel_Factory implements Factory<ComposeViewModel> {
  private final Provider<String> queryProvider;

  private final Provider<Long> threadIdProvider;

  private final Provider<List<String>> addressesProvider;

  private final Provider<String> sharedTextProvider;

  private final Provider<Attachments> sharedAttachmentsProvider;

  private final Provider<ContactRepository> contactRepoProvider;

  private final Provider<Context> contextProvider;

  private final Provider<ActiveConversationManager> activeConversationManagerProvider;

  private final Provider<AddScheduledMessage> addScheduledMessageProvider;

  private final Provider<BillingManager> billingManagerProvider;

  private final Provider<CancelDelayedMessage> cancelMessageProvider;

  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<DeleteMessages> deleteMessagesProvider;

  private final Provider<MarkRead> markReadProvider;

  private final Provider<MessageDetailsFormatter> messageDetailsFormatterProvider;

  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<Navigator> navigatorProvider;

  private final Provider<PermissionManager> permissionManagerProvider;

  private final Provider<PhoneNumberUtils> phoneNumberUtilsProvider;

  private final Provider<Preferences> prefsProvider;

  private final Provider<RetrySending> retrySendingProvider;

  private final Provider<SendMessage> sendMessageProvider;

  private final Provider<SubscriptionManagerCompat> subscriptionManagerProvider;

  public ComposeViewModel_Factory(
      Provider<String> queryProvider,
      Provider<Long> threadIdProvider,
      Provider<List<String>> addressesProvider,
      Provider<String> sharedTextProvider,
      Provider<Attachments> sharedAttachmentsProvider,
      Provider<ContactRepository> contactRepoProvider,
      Provider<Context> contextProvider,
      Provider<ActiveConversationManager> activeConversationManagerProvider,
      Provider<AddScheduledMessage> addScheduledMessageProvider,
      Provider<BillingManager> billingManagerProvider,
      Provider<CancelDelayedMessage> cancelMessageProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<DeleteMessages> deleteMessagesProvider,
      Provider<MarkRead> markReadProvider,
      Provider<MessageDetailsFormatter> messageDetailsFormatterProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<Navigator> navigatorProvider,
      Provider<PermissionManager> permissionManagerProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider,
      Provider<RetrySending> retrySendingProvider,
      Provider<SendMessage> sendMessageProvider,
      Provider<SubscriptionManagerCompat> subscriptionManagerProvider) {
    this.queryProvider = queryProvider;
    this.threadIdProvider = threadIdProvider;
    this.addressesProvider = addressesProvider;
    this.sharedTextProvider = sharedTextProvider;
    this.sharedAttachmentsProvider = sharedAttachmentsProvider;
    this.contactRepoProvider = contactRepoProvider;
    this.contextProvider = contextProvider;
    this.activeConversationManagerProvider = activeConversationManagerProvider;
    this.addScheduledMessageProvider = addScheduledMessageProvider;
    this.billingManagerProvider = billingManagerProvider;
    this.cancelMessageProvider = cancelMessageProvider;
    this.conversationRepoProvider = conversationRepoProvider;
    this.deleteMessagesProvider = deleteMessagesProvider;
    this.markReadProvider = markReadProvider;
    this.messageDetailsFormatterProvider = messageDetailsFormatterProvider;
    this.messageRepoProvider = messageRepoProvider;
    this.navigatorProvider = navigatorProvider;
    this.permissionManagerProvider = permissionManagerProvider;
    this.phoneNumberUtilsProvider = phoneNumberUtilsProvider;
    this.prefsProvider = prefsProvider;
    this.retrySendingProvider = retrySendingProvider;
    this.sendMessageProvider = sendMessageProvider;
    this.subscriptionManagerProvider = subscriptionManagerProvider;
  }

  @Override
  public ComposeViewModel get() {
    return provideInstance(
        queryProvider,
        threadIdProvider,
        addressesProvider,
        sharedTextProvider,
        sharedAttachmentsProvider,
        contactRepoProvider,
        contextProvider,
        activeConversationManagerProvider,
        addScheduledMessageProvider,
        billingManagerProvider,
        cancelMessageProvider,
        conversationRepoProvider,
        deleteMessagesProvider,
        markReadProvider,
        messageDetailsFormatterProvider,
        messageRepoProvider,
        navigatorProvider,
        permissionManagerProvider,
        phoneNumberUtilsProvider,
        prefsProvider,
        retrySendingProvider,
        sendMessageProvider,
        subscriptionManagerProvider);
  }

  public static ComposeViewModel provideInstance(
      Provider<String> queryProvider,
      Provider<Long> threadIdProvider,
      Provider<List<String>> addressesProvider,
      Provider<String> sharedTextProvider,
      Provider<Attachments> sharedAttachmentsProvider,
      Provider<ContactRepository> contactRepoProvider,
      Provider<Context> contextProvider,
      Provider<ActiveConversationManager> activeConversationManagerProvider,
      Provider<AddScheduledMessage> addScheduledMessageProvider,
      Provider<BillingManager> billingManagerProvider,
      Provider<CancelDelayedMessage> cancelMessageProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<DeleteMessages> deleteMessagesProvider,
      Provider<MarkRead> markReadProvider,
      Provider<MessageDetailsFormatter> messageDetailsFormatterProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<Navigator> navigatorProvider,
      Provider<PermissionManager> permissionManagerProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider,
      Provider<RetrySending> retrySendingProvider,
      Provider<SendMessage> sendMessageProvider,
      Provider<SubscriptionManagerCompat> subscriptionManagerProvider) {
    return new ComposeViewModel(
        queryProvider.get(),
        threadIdProvider.get(),
        addressesProvider.get(),
        sharedTextProvider.get(),
        sharedAttachmentsProvider.get(),
        contactRepoProvider.get(),
        contextProvider.get(),
        activeConversationManagerProvider.get(),
        addScheduledMessageProvider.get(),
        billingManagerProvider.get(),
        cancelMessageProvider.get(),
        conversationRepoProvider.get(),
        deleteMessagesProvider.get(),
        markReadProvider.get(),
        messageDetailsFormatterProvider.get(),
        messageRepoProvider.get(),
        navigatorProvider.get(),
        permissionManagerProvider.get(),
        phoneNumberUtilsProvider.get(),
        prefsProvider.get(),
        retrySendingProvider.get(),
        sendMessageProvider.get(),
        subscriptionManagerProvider.get());
  }

  public static ComposeViewModel_Factory create(
      Provider<String> queryProvider,
      Provider<Long> threadIdProvider,
      Provider<List<String>> addressesProvider,
      Provider<String> sharedTextProvider,
      Provider<Attachments> sharedAttachmentsProvider,
      Provider<ContactRepository> contactRepoProvider,
      Provider<Context> contextProvider,
      Provider<ActiveConversationManager> activeConversationManagerProvider,
      Provider<AddScheduledMessage> addScheduledMessageProvider,
      Provider<BillingManager> billingManagerProvider,
      Provider<CancelDelayedMessage> cancelMessageProvider,
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<DeleteMessages> deleteMessagesProvider,
      Provider<MarkRead> markReadProvider,
      Provider<MessageDetailsFormatter> messageDetailsFormatterProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<Navigator> navigatorProvider,
      Provider<PermissionManager> permissionManagerProvider,
      Provider<PhoneNumberUtils> phoneNumberUtilsProvider,
      Provider<Preferences> prefsProvider,
      Provider<RetrySending> retrySendingProvider,
      Provider<SendMessage> sendMessageProvider,
      Provider<SubscriptionManagerCompat> subscriptionManagerProvider) {
    return new ComposeViewModel_Factory(
        queryProvider,
        threadIdProvider,
        addressesProvider,
        sharedTextProvider,
        sharedAttachmentsProvider,
        contactRepoProvider,
        contextProvider,
        activeConversationManagerProvider,
        addScheduledMessageProvider,
        billingManagerProvider,
        cancelMessageProvider,
        conversationRepoProvider,
        deleteMessagesProvider,
        markReadProvider,
        messageDetailsFormatterProvider,
        messageRepoProvider,
        navigatorProvider,
        permissionManagerProvider,
        phoneNumberUtilsProvider,
        prefsProvider,
        retrySendingProvider,
        sendMessageProvider,
        subscriptionManagerProvider);
  }

  public static ComposeViewModel newComposeViewModel(
      String query,
      long threadId,
      List<String> addresses,
      String sharedText,
      Attachments sharedAttachments,
      ContactRepository contactRepo,
      Context context,
      ActiveConversationManager activeConversationManager,
      AddScheduledMessage addScheduledMessage,
      BillingManager billingManager,
      CancelDelayedMessage cancelMessage,
      ConversationRepository conversationRepo,
      DeleteMessages deleteMessages,
      MarkRead markRead,
      MessageDetailsFormatter messageDetailsFormatter,
      MessageRepository messageRepo,
      Navigator navigator,
      PermissionManager permissionManager,
      PhoneNumberUtils phoneNumberUtils,
      Preferences prefs,
      RetrySending retrySending,
      SendMessage sendMessage,
      SubscriptionManagerCompat subscriptionManager) {
    return new ComposeViewModel(
        query,
        threadId,
        addresses,
        sharedText,
        sharedAttachments,
        contactRepo,
        context,
        activeConversationManager,
        addScheduledMessage,
        billingManager,
        cancelMessage,
        conversationRepo,
        deleteMessages,
        markRead,
        messageDetailsFormatter,
        messageRepo,
        navigator,
        permissionManager,
        phoneNumberUtils,
        prefs,
        retrySending,
        sendMessage,
        subscriptionManager);
  }
}
