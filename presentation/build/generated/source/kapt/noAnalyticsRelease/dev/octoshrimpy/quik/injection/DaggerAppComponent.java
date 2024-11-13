package dev.octoshrimpy.quik.injection;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.f2prateek.rx.preferences2.RxSharedPreferences;
import com.squareup.moshi.Moshi;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.blocking.BlockingClient;
import dev.octoshrimpy.quik.blocking.BlockingManager;
import dev.octoshrimpy.quik.blocking.BlockingManager_Factory;
import dev.octoshrimpy.quik.blocking.CallBlockerBlockingClient;
import dev.octoshrimpy.quik.blocking.CallBlockerBlockingClient_Factory;
import dev.octoshrimpy.quik.blocking.CallControlBlockingClient;
import dev.octoshrimpy.quik.blocking.CallControlBlockingClient_Factory;
import dev.octoshrimpy.quik.blocking.QksmsBlockingClient;
import dev.octoshrimpy.quik.blocking.QksmsBlockingClient_Factory;
import dev.octoshrimpy.quik.blocking.ShouldIAnswerBlockingClient;
import dev.octoshrimpy.quik.blocking.ShouldIAnswerBlockingClient_Factory;
import dev.octoshrimpy.quik.common.MenuItemAdapter;
import dev.octoshrimpy.quik.common.Navigator;
import dev.octoshrimpy.quik.common.Navigator_Factory;
import dev.octoshrimpy.quik.common.QKApplication;
import dev.octoshrimpy.quik.common.QKApplication_MembersInjector;
import dev.octoshrimpy.quik.common.QkDialog;
import dev.octoshrimpy.quik.common.ViewModelFactory;
import dev.octoshrimpy.quik.common.base.QkThemedActivity_MembersInjector;
import dev.octoshrimpy.quik.common.util.BillingManagerImpl;
import dev.octoshrimpy.quik.common.util.BillingManagerImpl_Factory;
import dev.octoshrimpy.quik.common.util.Colors;
import dev.octoshrimpy.quik.common.util.Colors_Factory;
import dev.octoshrimpy.quik.common.util.DateFormatter;
import dev.octoshrimpy.quik.common.util.DateFormatter_Factory;
import dev.octoshrimpy.quik.common.util.FileLoggingTree;
import dev.octoshrimpy.quik.common.util.FileLoggingTree_Factory;
import dev.octoshrimpy.quik.common.util.FontProvider;
import dev.octoshrimpy.quik.common.util.FontProvider_Factory;
import dev.octoshrimpy.quik.common.util.MessageDetailsFormatter_Factory;
import dev.octoshrimpy.quik.common.util.NotificationManagerImpl;
import dev.octoshrimpy.quik.common.util.NotificationManagerImpl_Factory;
import dev.octoshrimpy.quik.common.util.QkChooserTargetService;
import dev.octoshrimpy.quik.common.util.QkChooserTargetService_MembersInjector;
import dev.octoshrimpy.quik.common.util.ShortcutManagerImpl;
import dev.octoshrimpy.quik.common.util.ShortcutManagerImpl_Factory;
import dev.octoshrimpy.quik.common.util.TextViewStyler;
import dev.octoshrimpy.quik.common.widget.AvatarView;
import dev.octoshrimpy.quik.common.widget.AvatarView_MembersInjector;
import dev.octoshrimpy.quik.common.widget.PagerTitleView;
import dev.octoshrimpy.quik.common.widget.PagerTitleView_MembersInjector;
import dev.octoshrimpy.quik.common.widget.PreferenceView;
import dev.octoshrimpy.quik.common.widget.QkEditText;
import dev.octoshrimpy.quik.common.widget.QkEditText_MembersInjector;
import dev.octoshrimpy.quik.common.widget.QkSwitch;
import dev.octoshrimpy.quik.common.widget.QkSwitch_MembersInjector;
import dev.octoshrimpy.quik.common.widget.QkTextView;
import dev.octoshrimpy.quik.common.widget.QkTextView_MembersInjector;
import dev.octoshrimpy.quik.common.widget.RadioPreferenceView;
import dev.octoshrimpy.quik.common.widget.RadioPreferenceView_MembersInjector;
import dev.octoshrimpy.quik.compat.SubscriptionManagerCompat;
import dev.octoshrimpy.quik.compat.SubscriptionManagerCompat_Factory;
import dev.octoshrimpy.quik.feature.backup.BackupActivity;
import dev.octoshrimpy.quik.feature.backup.BackupController;
import dev.octoshrimpy.quik.feature.backup.BackupController_MembersInjector;
import dev.octoshrimpy.quik.feature.backup.BackupPresenter;
import dev.octoshrimpy.quik.feature.backup.RestoreBackupService;
import dev.octoshrimpy.quik.feature.backup.RestoreBackupService_MembersInjector;
import dev.octoshrimpy.quik.feature.blocking.BlockingActivity;
import dev.octoshrimpy.quik.feature.blocking.BlockingController;
import dev.octoshrimpy.quik.feature.blocking.BlockingController_MembersInjector;
import dev.octoshrimpy.quik.feature.blocking.BlockingDialog;
import dev.octoshrimpy.quik.feature.blocking.BlockingPresenter;
import dev.octoshrimpy.quik.feature.blocking.manager.BlockingManagerController;
import dev.octoshrimpy.quik.feature.blocking.manager.BlockingManagerController_MembersInjector;
import dev.octoshrimpy.quik.feature.blocking.manager.BlockingManagerPresenter;
import dev.octoshrimpy.quik.feature.blocking.messages.BlockedMessagesAdapter;
import dev.octoshrimpy.quik.feature.blocking.messages.BlockedMessagesController;
import dev.octoshrimpy.quik.feature.blocking.messages.BlockedMessagesController_MembersInjector;
import dev.octoshrimpy.quik.feature.blocking.messages.BlockedMessagesPresenter;
import dev.octoshrimpy.quik.feature.blocking.numbers.BlockedNumbersController;
import dev.octoshrimpy.quik.feature.blocking.numbers.BlockedNumbersController_MembersInjector;
import dev.octoshrimpy.quik.feature.blocking.numbers.BlockedNumbersPresenter;
import dev.octoshrimpy.quik.feature.compose.AttachmentAdapter;
import dev.octoshrimpy.quik.feature.compose.ComposeActivity;
import dev.octoshrimpy.quik.feature.compose.ComposeActivityModule;
import dev.octoshrimpy.quik.feature.compose.ComposeActivityModule_ProvideAddressesFactory;
import dev.octoshrimpy.quik.feature.compose.ComposeActivityModule_ProvideComposeViewModelFactory;
import dev.octoshrimpy.quik.feature.compose.ComposeActivityModule_ProvideQueryFactory;
import dev.octoshrimpy.quik.feature.compose.ComposeActivityModule_ProvideSharedAttachmentsFactory;
import dev.octoshrimpy.quik.feature.compose.ComposeActivityModule_ProvideSharedTextFactory;
import dev.octoshrimpy.quik.feature.compose.ComposeActivityModule_ProvideThreadIdFactory;
import dev.octoshrimpy.quik.feature.compose.ComposeActivity_MembersInjector;
import dev.octoshrimpy.quik.feature.compose.ComposeViewModel;
import dev.octoshrimpy.quik.feature.compose.ComposeViewModel_Factory;
import dev.octoshrimpy.quik.feature.compose.MessagesAdapter;
import dev.octoshrimpy.quik.feature.compose.editing.ChipsAdapter;
import dev.octoshrimpy.quik.feature.compose.editing.ComposeItemAdapter;
import dev.octoshrimpy.quik.feature.compose.editing.DetailedChipView;
import dev.octoshrimpy.quik.feature.compose.editing.DetailedChipView_MembersInjector;
import dev.octoshrimpy.quik.feature.compose.editing.PhoneNumberPickerAdapter;
import dev.octoshrimpy.quik.feature.compose.part.FileBinder_Factory;
import dev.octoshrimpy.quik.feature.compose.part.MediaBinder_Factory;
import dev.octoshrimpy.quik.feature.compose.part.PartsAdapter_Factory;
import dev.octoshrimpy.quik.feature.compose.part.VCardBinder_Factory;
import dev.octoshrimpy.quik.feature.contacts.ContactsActivity;
import dev.octoshrimpy.quik.feature.contacts.ContactsActivityModule;
import dev.octoshrimpy.quik.feature.contacts.ContactsActivityModule_ProvideChipsFactory;
import dev.octoshrimpy.quik.feature.contacts.ContactsActivityModule_ProvideContactsViewModelFactory;
import dev.octoshrimpy.quik.feature.contacts.ContactsActivityModule_ProvideIsSharingFactory;
import dev.octoshrimpy.quik.feature.contacts.ContactsActivity_MembersInjector;
import dev.octoshrimpy.quik.feature.contacts.ContactsViewModel;
import dev.octoshrimpy.quik.feature.contacts.ContactsViewModel_Factory;
import dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoActivity;
import dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoAdapter;
import dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoController;
import dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoController_MembersInjector;
import dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoPresenter;
import dev.octoshrimpy.quik.feature.conversationinfo.injection.ConversationInfoComponent;
import dev.octoshrimpy.quik.feature.conversationinfo.injection.ConversationInfoModule;
import dev.octoshrimpy.quik.feature.conversationinfo.injection.ConversationInfoModule_ProvideThreadIdFactory;
import dev.octoshrimpy.quik.feature.conversations.ConversationItemTouchCallback;
import dev.octoshrimpy.quik.feature.conversations.ConversationsAdapter;
import dev.octoshrimpy.quik.feature.gallery.GalleryActivity;
import dev.octoshrimpy.quik.feature.gallery.GalleryActivityModule;
import dev.octoshrimpy.quik.feature.gallery.GalleryActivityModule_ProvideGalleryViewModelFactory;
import dev.octoshrimpy.quik.feature.gallery.GalleryActivityModule_ProvidePartIdFactory;
import dev.octoshrimpy.quik.feature.gallery.GalleryActivity_MembersInjector;
import dev.octoshrimpy.quik.feature.gallery.GalleryPagerAdapter;
import dev.octoshrimpy.quik.feature.gallery.GalleryViewModel;
import dev.octoshrimpy.quik.feature.gallery.GalleryViewModel_Factory;
import dev.octoshrimpy.quik.feature.main.DrawerBadgesExperiment;
import dev.octoshrimpy.quik.feature.main.MainActivity;
import dev.octoshrimpy.quik.feature.main.MainActivityModule;
import dev.octoshrimpy.quik.feature.main.MainActivityModule_ProvideCompositeDiposableLifecycleFactory;
import dev.octoshrimpy.quik.feature.main.MainActivityModule_ProvideMainViewModelFactory;
import dev.octoshrimpy.quik.feature.main.MainActivity_MembersInjector;
import dev.octoshrimpy.quik.feature.main.MainViewModel;
import dev.octoshrimpy.quik.feature.main.MainViewModel_Factory;
import dev.octoshrimpy.quik.feature.main.SearchAdapter;
import dev.octoshrimpy.quik.feature.notificationprefs.NotificationPrefsActivity;
import dev.octoshrimpy.quik.feature.notificationprefs.NotificationPrefsActivityModule;
import dev.octoshrimpy.quik.feature.notificationprefs.NotificationPrefsActivityModule_ProvideNotificationPrefsViewModelFactory;
import dev.octoshrimpy.quik.feature.notificationprefs.NotificationPrefsActivityModule_ProvideThreadIdFactory;
import dev.octoshrimpy.quik.feature.notificationprefs.NotificationPrefsActivity_MembersInjector;
import dev.octoshrimpy.quik.feature.notificationprefs.NotificationPrefsViewModel;
import dev.octoshrimpy.quik.feature.notificationprefs.NotificationPrefsViewModel_Factory;
import dev.octoshrimpy.quik.feature.plus.PlusActivity;
import dev.octoshrimpy.quik.feature.plus.PlusActivityModule;
import dev.octoshrimpy.quik.feature.plus.PlusActivityModule_ProvidePlusViewModelFactory;
import dev.octoshrimpy.quik.feature.plus.PlusActivity_MembersInjector;
import dev.octoshrimpy.quik.feature.plus.PlusViewModel;
import dev.octoshrimpy.quik.feature.plus.PlusViewModel_Factory;
import dev.octoshrimpy.quik.feature.plus.experiment.UpgradeButtonExperiment;
import dev.octoshrimpy.quik.feature.qkreply.QkReplyActivity;
import dev.octoshrimpy.quik.feature.qkreply.QkReplyActivityModule;
import dev.octoshrimpy.quik.feature.qkreply.QkReplyActivityModule_ProvideQkReplyViewModelFactory;
import dev.octoshrimpy.quik.feature.qkreply.QkReplyActivityModule_ProvideThreadIdFactory;
import dev.octoshrimpy.quik.feature.qkreply.QkReplyActivity_MembersInjector;
import dev.octoshrimpy.quik.feature.qkreply.QkReplyViewModel;
import dev.octoshrimpy.quik.feature.qkreply.QkReplyViewModel_Factory;
import dev.octoshrimpy.quik.feature.scheduled.ScheduledActivity;
import dev.octoshrimpy.quik.feature.scheduled.ScheduledActivityModule;
import dev.octoshrimpy.quik.feature.scheduled.ScheduledActivityModule_ProvideScheduledViewModelFactory;
import dev.octoshrimpy.quik.feature.scheduled.ScheduledActivity_MembersInjector;
import dev.octoshrimpy.quik.feature.scheduled.ScheduledMessageAdapter;
import dev.octoshrimpy.quik.feature.scheduled.ScheduledViewModel;
import dev.octoshrimpy.quik.feature.scheduled.ScheduledViewModel_Factory;
import dev.octoshrimpy.quik.feature.settings.SettingsActivity;
import dev.octoshrimpy.quik.feature.settings.SettingsController;
import dev.octoshrimpy.quik.feature.settings.SettingsController_MembersInjector;
import dev.octoshrimpy.quik.feature.settings.SettingsPresenter;
import dev.octoshrimpy.quik.feature.settings.about.AboutController;
import dev.octoshrimpy.quik.feature.settings.about.AboutController_MembersInjector;
import dev.octoshrimpy.quik.feature.settings.about.AboutPresenter;
import dev.octoshrimpy.quik.feature.settings.swipe.SwipeActionsController;
import dev.octoshrimpy.quik.feature.settings.swipe.SwipeActionsController_MembersInjector;
import dev.octoshrimpy.quik.feature.settings.swipe.SwipeActionsPresenter;
import dev.octoshrimpy.quik.feature.themepicker.ThemeAdapter;
import dev.octoshrimpy.quik.feature.themepicker.ThemePagerAdapter;
import dev.octoshrimpy.quik.feature.themepicker.ThemePickerController;
import dev.octoshrimpy.quik.feature.themepicker.ThemePickerController_MembersInjector;
import dev.octoshrimpy.quik.feature.themepicker.ThemePickerPresenter;
import dev.octoshrimpy.quik.feature.themepicker.injection.ThemePickerComponent;
import dev.octoshrimpy.quik.feature.themepicker.injection.ThemePickerModule;
import dev.octoshrimpy.quik.feature.themepicker.injection.ThemePickerModule_ProvideThreadIdFactory;
import dev.octoshrimpy.quik.feature.widget.WidgetAdapter;
import dev.octoshrimpy.quik.feature.widget.WidgetAdapter_MembersInjector;
import dev.octoshrimpy.quik.feature.widget.WidgetProvider;
import dev.octoshrimpy.quik.feature.widget.WidgetProvider_MembersInjector;
import dev.octoshrimpy.quik.filter.ContactFilter;
import dev.octoshrimpy.quik.filter.ContactFilter_Factory;
import dev.octoshrimpy.quik.filter.ContactGroupFilter_Factory;
import dev.octoshrimpy.quik.filter.ConversationFilter;
import dev.octoshrimpy.quik.filter.ConversationFilter_Factory;
import dev.octoshrimpy.quik.filter.PhoneNumberFilter;
import dev.octoshrimpy.quik.filter.PhoneNumberFilter_Factory;
import dev.octoshrimpy.quik.filter.RecipientFilter;
import dev.octoshrimpy.quik.filter.RecipientFilter_Factory;
import dev.octoshrimpy.quik.injection.android.ActivityBuilderModule_BindBackupActivity;
import dev.octoshrimpy.quik.injection.android.ActivityBuilderModule_BindBlockingActivity;
import dev.octoshrimpy.quik.injection.android.ActivityBuilderModule_BindComposeActivity;
import dev.octoshrimpy.quik.injection.android.ActivityBuilderModule_BindContactsActivity;
import dev.octoshrimpy.quik.injection.android.ActivityBuilderModule_BindConversationInfoActivity;
import dev.octoshrimpy.quik.injection.android.ActivityBuilderModule_BindGalleryActivity;
import dev.octoshrimpy.quik.injection.android.ActivityBuilderModule_BindMainActivity;
import dev.octoshrimpy.quik.injection.android.ActivityBuilderModule_BindNotificationPrefsActivity;
import dev.octoshrimpy.quik.injection.android.ActivityBuilderModule_BindPlusActivity;
import dev.octoshrimpy.quik.injection.android.ActivityBuilderModule_BindQkReplyActivity;
import dev.octoshrimpy.quik.injection.android.ActivityBuilderModule_BindScheduledActivity;
import dev.octoshrimpy.quik.injection.android.ActivityBuilderModule_BindSettingsActivity;
import dev.octoshrimpy.quik.injection.android.BroadcastReceiverBuilderModule_BindBlockThreadReceiver;
import dev.octoshrimpy.quik.injection.android.BroadcastReceiverBuilderModule_BindBootReceiver;
import dev.octoshrimpy.quik.injection.android.BroadcastReceiverBuilderModule_BindDefaultSmsChangedReceiver;
import dev.octoshrimpy.quik.injection.android.BroadcastReceiverBuilderModule_BindDeleteMessagesReceiver;
import dev.octoshrimpy.quik.injection.android.BroadcastReceiverBuilderModule_BindMarkArchivedReceiver;
import dev.octoshrimpy.quik.injection.android.BroadcastReceiverBuilderModule_BindMarkReadReceiver;
import dev.octoshrimpy.quik.injection.android.BroadcastReceiverBuilderModule_BindMarkSeenReceiver;
import dev.octoshrimpy.quik.injection.android.BroadcastReceiverBuilderModule_BindMmsReceivedReceiver;
import dev.octoshrimpy.quik.injection.android.BroadcastReceiverBuilderModule_BindMmsReceiver;
import dev.octoshrimpy.quik.injection.android.BroadcastReceiverBuilderModule_BindMmsSentReceiver;
import dev.octoshrimpy.quik.injection.android.BroadcastReceiverBuilderModule_BindMmsUpdatedReceiver;
import dev.octoshrimpy.quik.injection.android.BroadcastReceiverBuilderModule_BindNightModeReceiver;
import dev.octoshrimpy.quik.injection.android.BroadcastReceiverBuilderModule_BindRemoteMessagingReceiver;
import dev.octoshrimpy.quik.injection.android.BroadcastReceiverBuilderModule_BindSendScheduledMessageReceiver;
import dev.octoshrimpy.quik.injection.android.BroadcastReceiverBuilderModule_BindSmsDeliveredReceiver;
import dev.octoshrimpy.quik.injection.android.BroadcastReceiverBuilderModule_BindSmsProviderChangedReceiver;
import dev.octoshrimpy.quik.injection.android.BroadcastReceiverBuilderModule_BindSmsReceiver;
import dev.octoshrimpy.quik.injection.android.BroadcastReceiverBuilderModule_BindSmsSentReceiver;
import dev.octoshrimpy.quik.injection.android.BroadcastReceiverBuilderModule_BindWidgetProvider;
import dev.octoshrimpy.quik.injection.android.ServiceBuilderModule_BindAutoDeleteService;
import dev.octoshrimpy.quik.injection.android.ServiceBuilderModule_BindHeadlessSmsSendService;
import dev.octoshrimpy.quik.injection.android.ServiceBuilderModule_BindRestoreBackupService;
import dev.octoshrimpy.quik.injection.android.ServiceBuilderModule_BindSendSmsReceiver;
import dev.octoshrimpy.quik.interactor.AddScheduledMessage_Factory;
import dev.octoshrimpy.quik.interactor.CancelDelayedMessage_Factory;
import dev.octoshrimpy.quik.interactor.DeleteConversations;
import dev.octoshrimpy.quik.interactor.DeleteConversations_Factory;
import dev.octoshrimpy.quik.interactor.DeleteMessages;
import dev.octoshrimpy.quik.interactor.DeleteMessages_Factory;
import dev.octoshrimpy.quik.interactor.DeleteOldMessages;
import dev.octoshrimpy.quik.interactor.MarkAllSeen_Factory;
import dev.octoshrimpy.quik.interactor.MarkArchived;
import dev.octoshrimpy.quik.interactor.MarkArchived_Factory;
import dev.octoshrimpy.quik.interactor.MarkBlocked;
import dev.octoshrimpy.quik.interactor.MarkDelivered;
import dev.octoshrimpy.quik.interactor.MarkDeliveryFailed;
import dev.octoshrimpy.quik.interactor.MarkFailed;
import dev.octoshrimpy.quik.interactor.MarkPinned_Factory;
import dev.octoshrimpy.quik.interactor.MarkRead;
import dev.octoshrimpy.quik.interactor.MarkRead_Factory;
import dev.octoshrimpy.quik.interactor.MarkSeen;
import dev.octoshrimpy.quik.interactor.MarkSent;
import dev.octoshrimpy.quik.interactor.MarkUnarchived;
import dev.octoshrimpy.quik.interactor.MarkUnarchived_Factory;
import dev.octoshrimpy.quik.interactor.MarkUnblocked;
import dev.octoshrimpy.quik.interactor.MarkUnpinned_Factory;
import dev.octoshrimpy.quik.interactor.MarkUnread_Factory;
import dev.octoshrimpy.quik.interactor.MigratePreferences_Factory;
import dev.octoshrimpy.quik.interactor.PerformBackup;
import dev.octoshrimpy.quik.interactor.ReceiveMms;
import dev.octoshrimpy.quik.interactor.ReceiveSms;
import dev.octoshrimpy.quik.interactor.RetrySending;
import dev.octoshrimpy.quik.interactor.RetrySending_Factory;
import dev.octoshrimpy.quik.interactor.SaveImage_Factory;
import dev.octoshrimpy.quik.interactor.SendMessage;
import dev.octoshrimpy.quik.interactor.SendMessage_Factory;
import dev.octoshrimpy.quik.interactor.SendScheduledMessage;
import dev.octoshrimpy.quik.interactor.SendScheduledMessage_Factory;
import dev.octoshrimpy.quik.interactor.SetDefaultPhoneNumber_Factory;
import dev.octoshrimpy.quik.interactor.SyncContacts_Factory;
import dev.octoshrimpy.quik.interactor.SyncMessage;
import dev.octoshrimpy.quik.interactor.SyncMessages;
import dev.octoshrimpy.quik.interactor.SyncMessages_Factory;
import dev.octoshrimpy.quik.interactor.UpdateBadge;
import dev.octoshrimpy.quik.interactor.UpdateBadge_Factory;
import dev.octoshrimpy.quik.interactor.UpdateScheduledMessageAlarms;
import dev.octoshrimpy.quik.interactor.UpdateScheduledMessageAlarms_Factory;
import dev.octoshrimpy.quik.listener.ContactAddedListenerImpl_Factory;
import dev.octoshrimpy.quik.manager.ActiveConversationManager;
import dev.octoshrimpy.quik.manager.ActiveConversationManagerImpl;
import dev.octoshrimpy.quik.manager.ActiveConversationManagerImpl_Factory;
import dev.octoshrimpy.quik.manager.AlarmManager;
import dev.octoshrimpy.quik.manager.AlarmManagerImpl;
import dev.octoshrimpy.quik.manager.AlarmManagerImpl_Factory;
import dev.octoshrimpy.quik.manager.AnalyticsManager;
import dev.octoshrimpy.quik.manager.AnalyticsManagerImpl;
import dev.octoshrimpy.quik.manager.AnalyticsManagerImpl_Factory;
import dev.octoshrimpy.quik.manager.BillingManager;
import dev.octoshrimpy.quik.manager.ChangelogManagerImpl_Factory;
import dev.octoshrimpy.quik.manager.KeyManagerImpl;
import dev.octoshrimpy.quik.manager.KeyManagerImpl_Factory;
import dev.octoshrimpy.quik.manager.NotificationManager;
import dev.octoshrimpy.quik.manager.PermissionManager;
import dev.octoshrimpy.quik.manager.PermissionManagerImpl;
import dev.octoshrimpy.quik.manager.PermissionManagerImpl_Factory;
import dev.octoshrimpy.quik.manager.ReferralManager;
import dev.octoshrimpy.quik.manager.ReferralManagerImpl;
import dev.octoshrimpy.quik.manager.ShortcutManager;
import dev.octoshrimpy.quik.manager.WidgetManager;
import dev.octoshrimpy.quik.manager.WidgetManagerImpl;
import dev.octoshrimpy.quik.manager.WidgetManagerImpl_Factory;
import dev.octoshrimpy.quik.mapper.CursorToContactGroupImpl_Factory;
import dev.octoshrimpy.quik.mapper.CursorToContactGroupMemberImpl_Factory;
import dev.octoshrimpy.quik.mapper.CursorToContactImpl;
import dev.octoshrimpy.quik.mapper.CursorToContactImpl_Factory;
import dev.octoshrimpy.quik.mapper.CursorToConversation;
import dev.octoshrimpy.quik.mapper.CursorToConversationImpl;
import dev.octoshrimpy.quik.mapper.CursorToConversationImpl_Factory;
import dev.octoshrimpy.quik.mapper.CursorToMessageImpl_Factory;
import dev.octoshrimpy.quik.mapper.CursorToPartImpl_Factory;
import dev.octoshrimpy.quik.mapper.CursorToRecipient;
import dev.octoshrimpy.quik.mapper.CursorToRecipientImpl;
import dev.octoshrimpy.quik.mapper.CursorToRecipientImpl_Factory;
import dev.octoshrimpy.quik.mapper.RatingManagerImpl_Factory;
import dev.octoshrimpy.quik.migration.QkMigration;
import dev.octoshrimpy.quik.migration.QkRealmMigration;
import dev.octoshrimpy.quik.receiver.BlockThreadReceiver;
import dev.octoshrimpy.quik.receiver.BlockThreadReceiver_MembersInjector;
import dev.octoshrimpy.quik.receiver.BootReceiver;
import dev.octoshrimpy.quik.receiver.BootReceiver_MembersInjector;
import dev.octoshrimpy.quik.receiver.DefaultSmsChangedReceiver;
import dev.octoshrimpy.quik.receiver.DefaultSmsChangedReceiver_MembersInjector;
import dev.octoshrimpy.quik.receiver.DeleteMessagesReceiver;
import dev.octoshrimpy.quik.receiver.DeleteMessagesReceiver_MembersInjector;
import dev.octoshrimpy.quik.receiver.MarkArchivedReceiver;
import dev.octoshrimpy.quik.receiver.MarkArchivedReceiver_MembersInjector;
import dev.octoshrimpy.quik.receiver.MarkReadReceiver;
import dev.octoshrimpy.quik.receiver.MarkReadReceiver_MembersInjector;
import dev.octoshrimpy.quik.receiver.MarkSeenReceiver;
import dev.octoshrimpy.quik.receiver.MarkSeenReceiver_MembersInjector;
import dev.octoshrimpy.quik.receiver.MmsReceivedReceiver;
import dev.octoshrimpy.quik.receiver.MmsReceivedReceiver_MembersInjector;
import dev.octoshrimpy.quik.receiver.MmsReceiver;
import dev.octoshrimpy.quik.receiver.MmsSentReceiver;
import dev.octoshrimpy.quik.receiver.MmsSentReceiver_MembersInjector;
import dev.octoshrimpy.quik.receiver.MmsUpdatedReceiver;
import dev.octoshrimpy.quik.receiver.MmsUpdatedReceiver_MembersInjector;
import dev.octoshrimpy.quik.receiver.NightModeReceiver;
import dev.octoshrimpy.quik.receiver.NightModeReceiver_MembersInjector;
import dev.octoshrimpy.quik.receiver.RemoteMessagingReceiver;
import dev.octoshrimpy.quik.receiver.RemoteMessagingReceiver_MembersInjector;
import dev.octoshrimpy.quik.receiver.SendScheduledMessageReceiver;
import dev.octoshrimpy.quik.receiver.SendScheduledMessageReceiver_MembersInjector;
import dev.octoshrimpy.quik.receiver.SendSmsReceiver;
import dev.octoshrimpy.quik.receiver.SendSmsReceiver_MembersInjector;
import dev.octoshrimpy.quik.receiver.SmsDeliveredReceiver;
import dev.octoshrimpy.quik.receiver.SmsDeliveredReceiver_MembersInjector;
import dev.octoshrimpy.quik.receiver.SmsProviderChangedReceiver;
import dev.octoshrimpy.quik.receiver.SmsProviderChangedReceiver_MembersInjector;
import dev.octoshrimpy.quik.receiver.SmsReceiver;
import dev.octoshrimpy.quik.receiver.SmsReceiver_MembersInjector;
import dev.octoshrimpy.quik.receiver.SmsSentReceiver;
import dev.octoshrimpy.quik.receiver.SmsSentReceiver_MembersInjector;
import dev.octoshrimpy.quik.repository.BackupRepository;
import dev.octoshrimpy.quik.repository.BackupRepositoryImpl;
import dev.octoshrimpy.quik.repository.BackupRepositoryImpl_Factory;
import dev.octoshrimpy.quik.repository.BlockingRepository;
import dev.octoshrimpy.quik.repository.BlockingRepositoryImpl;
import dev.octoshrimpy.quik.repository.BlockingRepositoryImpl_Factory;
import dev.octoshrimpy.quik.repository.ContactRepository;
import dev.octoshrimpy.quik.repository.ContactRepositoryImpl;
import dev.octoshrimpy.quik.repository.ContactRepositoryImpl_Factory;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import dev.octoshrimpy.quik.repository.ConversationRepositoryImpl;
import dev.octoshrimpy.quik.repository.ConversationRepositoryImpl_Factory;
import dev.octoshrimpy.quik.repository.MessageRepository;
import dev.octoshrimpy.quik.repository.MessageRepositoryImpl;
import dev.octoshrimpy.quik.repository.MessageRepositoryImpl_Factory;
import dev.octoshrimpy.quik.repository.ScheduledMessageRepository;
import dev.octoshrimpy.quik.repository.ScheduledMessageRepositoryImpl;
import dev.octoshrimpy.quik.repository.ScheduledMessageRepositoryImpl_Factory;
import dev.octoshrimpy.quik.repository.SyncRepository;
import dev.octoshrimpy.quik.repository.SyncRepositoryImpl;
import dev.octoshrimpy.quik.repository.SyncRepositoryImpl_Factory;
import dev.octoshrimpy.quik.service.AutoDeleteService;
import dev.octoshrimpy.quik.service.AutoDeleteService_MembersInjector;
import dev.octoshrimpy.quik.service.HeadlessSmsSendService;
import dev.octoshrimpy.quik.service.HeadlessSmsSendService_MembersInjector;
import dev.octoshrimpy.quik.util.NightModeManager;
import dev.octoshrimpy.quik.util.NightModeManager_Factory;
import dev.octoshrimpy.quik.util.PhoneNumberUtils;
import dev.octoshrimpy.quik.util.PhoneNumberUtils_Factory;
import dev.octoshrimpy.quik.util.Preferences;
import dev.octoshrimpy.quik.util.Preferences_Factory;
import io.reactivex.disposables.CompositeDisposable;
import java.util.Collections;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private AppModule appModule;

  private Provider<AnalyticsManagerImpl> analyticsManagerImplProvider;

  private Provider<Context> provideContextProvider;

  private Provider<PhoneNumberUtils> phoneNumberUtilsProvider;

  private Provider<SharedPreferences> provideSharedPreferencesProvider;

  private Provider<RxSharedPreferences> provideRxPreferencesProvider;

  private Provider<Preferences> preferencesProvider;

  private Provider<BillingManagerImpl> billingManagerImplProvider;

  private Provider<ActivityBuilderModule_BindMainActivity.MainActivitySubcomponent.Builder>
      mainActivitySubcomponentBuilderProvider;

  private Provider<ActivityBuilderModule_BindPlusActivity.PlusActivitySubcomponent.Builder>
      plusActivitySubcomponentBuilderProvider;

  private Provider<ActivityBuilderModule_BindBackupActivity.BackupActivitySubcomponent.Builder>
      backupActivitySubcomponentBuilderProvider;

  private Provider<ActivityBuilderModule_BindComposeActivity.ComposeActivitySubcomponent.Builder>
      composeActivitySubcomponentBuilderProvider;

  private Provider<ActivityBuilderModule_BindContactsActivity.ContactsActivitySubcomponent.Builder>
      contactsActivitySubcomponentBuilderProvider;

  private Provider<
          ActivityBuilderModule_BindConversationInfoActivity.ConversationInfoActivitySubcomponent
              .Builder>
      conversationInfoActivitySubcomponentBuilderProvider;

  private Provider<ActivityBuilderModule_BindGalleryActivity.GalleryActivitySubcomponent.Builder>
      galleryActivitySubcomponentBuilderProvider;

  private Provider<
          ActivityBuilderModule_BindNotificationPrefsActivity.NotificationPrefsActivitySubcomponent
              .Builder>
      notificationPrefsActivitySubcomponentBuilderProvider;

  private Provider<ActivityBuilderModule_BindQkReplyActivity.QkReplyActivitySubcomponent.Builder>
      qkReplyActivitySubcomponentBuilderProvider;

  private Provider<
          ActivityBuilderModule_BindScheduledActivity.ScheduledActivitySubcomponent.Builder>
      scheduledActivitySubcomponentBuilderProvider;

  private Provider<ActivityBuilderModule_BindSettingsActivity.SettingsActivitySubcomponent.Builder>
      settingsActivitySubcomponentBuilderProvider;

  private Provider<ActivityBuilderModule_BindBlockingActivity.BlockingActivitySubcomponent.Builder>
      blockingActivitySubcomponentBuilderProvider;

  private Provider<
          BroadcastReceiverBuilderModule_BindBlockThreadReceiver.BlockThreadReceiverSubcomponent
              .Builder>
      blockThreadReceiverSubcomponentBuilderProvider;

  private Provider<BroadcastReceiverBuilderModule_BindBootReceiver.BootReceiverSubcomponent.Builder>
      bootReceiverSubcomponentBuilderProvider;

  private Provider<
          BroadcastReceiverBuilderModule_BindDefaultSmsChangedReceiver
              .DefaultSmsChangedReceiverSubcomponent.Builder>
      defaultSmsChangedReceiverSubcomponentBuilderProvider;

  private Provider<
          BroadcastReceiverBuilderModule_BindDeleteMessagesReceiver
              .DeleteMessagesReceiverSubcomponent.Builder>
      deleteMessagesReceiverSubcomponentBuilderProvider;

  private Provider<
          BroadcastReceiverBuilderModule_BindMarkArchivedReceiver.MarkArchivedReceiverSubcomponent
              .Builder>
      markArchivedReceiverSubcomponentBuilderProvider;

  private Provider<
          BroadcastReceiverBuilderModule_BindMarkReadReceiver.MarkReadReceiverSubcomponent.Builder>
      markReadReceiverSubcomponentBuilderProvider;

  private Provider<
          BroadcastReceiverBuilderModule_BindMarkSeenReceiver.MarkSeenReceiverSubcomponent.Builder>
      markSeenReceiverSubcomponentBuilderProvider;

  private Provider<
          BroadcastReceiverBuilderModule_BindMmsReceivedReceiver.MmsReceivedReceiverSubcomponent
              .Builder>
      mmsReceivedReceiverSubcomponentBuilderProvider;

  private Provider<BroadcastReceiverBuilderModule_BindMmsReceiver.MmsReceiverSubcomponent.Builder>
      mmsReceiverSubcomponentBuilderProvider;

  private Provider<
          BroadcastReceiverBuilderModule_BindMmsSentReceiver.MmsSentReceiverSubcomponent.Builder>
      mmsSentReceiverSubcomponentBuilderProvider;

  private Provider<
          BroadcastReceiverBuilderModule_BindMmsUpdatedReceiver.MmsUpdatedReceiverSubcomponent
              .Builder>
      mmsUpdatedReceiverSubcomponentBuilderProvider;

  private Provider<
          BroadcastReceiverBuilderModule_BindNightModeReceiver.NightModeReceiverSubcomponent
              .Builder>
      nightModeReceiverSubcomponentBuilderProvider;

  private Provider<
          BroadcastReceiverBuilderModule_BindRemoteMessagingReceiver
              .RemoteMessagingReceiverSubcomponent.Builder>
      remoteMessagingReceiverSubcomponentBuilderProvider;

  private Provider<
          BroadcastReceiverBuilderModule_BindSendScheduledMessageReceiver
              .SendScheduledMessageReceiverSubcomponent.Builder>
      sendScheduledMessageReceiverSubcomponentBuilderProvider;

  private Provider<
          BroadcastReceiverBuilderModule_BindSmsDeliveredReceiver.SmsDeliveredReceiverSubcomponent
              .Builder>
      smsDeliveredReceiverSubcomponentBuilderProvider;

  private Provider<
          BroadcastReceiverBuilderModule_BindSmsProviderChangedReceiver
              .SmsProviderChangedReceiverSubcomponent.Builder>
      smsProviderChangedReceiverSubcomponentBuilderProvider;

  private Provider<BroadcastReceiverBuilderModule_BindSmsReceiver.SmsReceiverSubcomponent.Builder>
      smsReceiverSubcomponentBuilderProvider;

  private Provider<
          BroadcastReceiverBuilderModule_BindSmsSentReceiver.SmsSentReceiverSubcomponent.Builder>
      smsSentReceiverSubcomponentBuilderProvider;

  private Provider<
          BroadcastReceiverBuilderModule_BindWidgetProvider.WidgetProviderSubcomponent.Builder>
      widgetProviderSubcomponentBuilderProvider;

  private Provider<ServiceBuilderModule_BindSendSmsReceiver.SendSmsReceiverSubcomponent.Builder>
      sendSmsReceiverSubcomponentBuilderProvider;

  private Provider<ServiceBuilderModule_BindAutoDeleteService.AutoDeleteServiceSubcomponent.Builder>
      autoDeleteServiceSubcomponentBuilderProvider;

  private Provider<
          ServiceBuilderModule_BindHeadlessSmsSendService.HeadlessSmsSendServiceSubcomponent
              .Builder>
      headlessSmsSendServiceSubcomponentBuilderProvider;

  private Provider<
          ServiceBuilderModule_BindRestoreBackupService.RestoreBackupServiceSubcomponent.Builder>
      restoreBackupServiceSubcomponentBuilderProvider;

  private Provider<FileLoggingTree> fileLoggingTreeProvider;

  private WidgetManagerImpl_Factory widgetManagerImplProvider;

  private AppModule_ProvideWidgetManagerFactory provideWidgetManagerProvider;

  private Provider<NightModeManager> nightModeManagerProvider;

  private AppModule_ProvideAnalyticsManagerFactory provideAnalyticsManagerProvider;

  private AppModule_ProvideBillingManagerFactory provideBillingManagerProvider;

  private Provider<Colors> colorsProvider;

  private PhoneNumberFilter_Factory phoneNumberFilterProvider;

  private ContactFilter_Factory contactFilterProvider;

  private RecipientFilter_Factory recipientFilterProvider;

  private ConversationFilter_Factory conversationFilterProvider;

  private PermissionManagerImpl_Factory permissionManagerImplProvider;

  private AppModule_ProvidePermissionsManagerFactory providePermissionsManagerProvider;

  private CursorToConversationImpl_Factory cursorToConversationImplProvider;

  private AppModule_ProvideCursorToConversationFactory provideCursorToConversationProvider;

  private CursorToRecipientImpl_Factory cursorToRecipientImplProvider;

  private AppModule_ProvideCursorToRecipientFactory provideCursorToRecipientProvider;

  private ConversationRepositoryImpl_Factory conversationRepositoryImplProvider;

  private AppModule_ProvideConversationRepositoryFactory provideConversationRepositoryProvider;

  private Provider<ActiveConversationManagerImpl> activeConversationManagerImplProvider;

  private AppModule_ProvideActiveConversationManagerFactory
      provideActiveConversationManagerProvider;

  private Provider<KeyManagerImpl> keyManagerImplProvider;

  private AppModule_ProvideKeyManagerFactory provideKeyManagerProvider;

  private AppModule_ProvideContentResolverFactory provideContentResolverProvider;

  private CursorToPartImpl_Factory cursorToPartImplProvider;

  private AppModule_ProvideCursorToPartFactory provideCursorToPartProvider;

  private CursorToMessageImpl_Factory cursorToMessageImplProvider;

  private AppModule_ProvideCursorToMessageFactory provideCursorToMessageProvider;

  private CursorToContactImpl_Factory cursorToContactImplProvider;

  private AppModule_ProvideCursorToContactFactory provideCursorToContactProvider;

  private CursorToContactGroupImpl_Factory cursorToContactGroupImplProvider;

  private AppModule_ProvideCursorToContactGroupFactory provideCursorToContactGroupProvider;

  private CursorToContactGroupMemberImpl_Factory cursorToContactGroupMemberImplProvider;

  private AppModule_ProvideCursorToContactGroupMemberFactory
      provideCursorToContactGroupMemberProvider;

  private Provider<SyncRepositoryImpl> syncRepositoryImplProvider;

  private AppModule_ProvideSyncRepositoryFactory provideSyncRepositoryProvider;

  private Provider<MessageRepositoryImpl> messageRepositoryImplProvider;

  private AppModule_ProvideMessageRepositoryFactory provideMessageRepositoryProvider;

  private Provider<NotificationManagerImpl> notificationManagerImplProvider;

  private AppModule_ProvideNotificationsManagerFactory provideNotificationsManagerProvider;

  private Provider<Navigator> navigatorProvider;

  private Provider<Moshi> provideMoshiProvider;

  private Provider<BackupRepositoryImpl> backupRepositoryImplProvider;

  private Provider<DateFormatter> dateFormatterProvider;

  private CallBlockerBlockingClient_Factory callBlockerBlockingClientProvider;

  private CallControlBlockingClient_Factory callControlBlockingClientProvider;

  private BlockingRepositoryImpl_Factory blockingRepositoryImplProvider;

  private AppModule_ProvideBlockingRepositoryFactory provideBlockingRepositoryProvider;

  private QksmsBlockingClient_Factory qksmsBlockingClientProvider;

  private ShouldIAnswerBlockingClient_Factory shouldIAnswerBlockingClientProvider;

  private Provider<BlockingManager> blockingManagerProvider;

  private Provider<FontProvider> fontProvider;

  private ContactAddedListenerImpl_Factory contactAddedListenerImplProvider;

  private AppModule_ProvideContactAddedListenerFactory provideContactAddedListenerProvider;

  private ChangelogManagerImpl_Factory changelogManagerImplProvider;

  private AppModule_ChangelogManagerFactory changelogManagerProvider;

  private ShortcutManagerImpl_Factory shortcutManagerImplProvider;

  private AppModule_ProvideShortcutManagerFactory provideShortcutManagerProvider;

  private UpdateBadge_Factory updateBadgeProvider;

  private DeleteConversations_Factory deleteConversationsProvider;

  private MarkRead_Factory markReadProvider;

  private RatingManagerImpl_Factory ratingManagerImplProvider;

  private AppModule_ProvideRatingManagerFactory provideRatingManagerProvider;

  private SyncMessages_Factory syncMessagesProvider;

  private Provider<ContactRepositoryImpl> contactRepositoryImplProvider;

  private AppModule_ProvideContactRepositoryFactory provideContactRepositoryProvider;

  private AppModule_ProvideScheduledMessagesRepositoryFactory
      provideScheduledMessagesRepositoryProvider;

  private AlarmManagerImpl_Factory alarmManagerImplProvider;

  private AppModule_ProvideAlarmManagerFactory provideAlarmManagerProvider;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
    initialize2(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  private AnalyticsManager getAnalyticsManager() {
    return AppModule_ProvideAnalyticsManagerFactory.proxyProvideAnalyticsManager(
        appModule, analyticsManagerImplProvider.get());
  }

  private PhoneNumberFilter getPhoneNumberFilter() {
    return new PhoneNumberFilter(phoneNumberUtilsProvider.get());
  }

  private ContactFilter getContactFilter() {
    return new ContactFilter(getPhoneNumberFilter());
  }

  private RecipientFilter getRecipientFilter() {
    return new RecipientFilter(getContactFilter(), getPhoneNumberFilter());
  }

  private ConversationFilter getConversationFilter() {
    return new ConversationFilter(getRecipientFilter());
  }

  private PermissionManagerImpl getPermissionManagerImpl() {
    return new PermissionManagerImpl(provideContextProvider.get());
  }

  private PermissionManager getPermissionManager() {
    return AppModule_ProvidePermissionsManagerFactory.proxyProvidePermissionsManager(
        appModule, getPermissionManagerImpl());
  }

  private CursorToConversationImpl getCursorToConversationImpl() {
    return new CursorToConversationImpl(provideContextProvider.get(), getPermissionManager());
  }

  private CursorToConversation getCursorToConversation() {
    return AppModule_ProvideCursorToConversationFactory.proxyProvideCursorToConversation(
        appModule, getCursorToConversationImpl());
  }

  private CursorToRecipientImpl getCursorToRecipientImpl() {
    return new CursorToRecipientImpl(provideContextProvider.get(), getPermissionManager());
  }

  private CursorToRecipient getCursorToRecipient() {
    return AppModule_ProvideCursorToRecipientFactory.proxyProvideCursorToRecipient(
        appModule, getCursorToRecipientImpl());
  }

  private ConversationRepositoryImpl getConversationRepositoryImpl() {
    return new ConversationRepositoryImpl(
        provideContextProvider.get(),
        getConversationFilter(),
        getCursorToConversation(),
        getCursorToRecipient(),
        phoneNumberUtilsProvider.get());
  }

  private ConversationRepository getConversationRepository() {
    return AppModule_ProvideConversationRepositoryFactory.proxyProvideConversationRepository(
        appModule, getConversationRepositoryImpl());
  }

  private BlockingRepositoryImpl getBlockingRepositoryImpl() {
    return new BlockingRepositoryImpl(phoneNumberUtilsProvider.get());
  }

  private BlockingRepository getBlockingRepository() {
    return AppModule_ProvideBlockingRepositoryFactory.proxyProvideBlockingRepository(
        appModule, getBlockingRepositoryImpl());
  }

  private QksmsBlockingClient getQksmsBlockingClient() {
    return new QksmsBlockingClient(getBlockingRepository());
  }

  private QkMigration getQkMigration() {
    return new QkMigration(
        provideContextProvider.get(),
        getConversationRepository(),
        preferencesProvider.get(),
        getQksmsBlockingClient());
  }

  private BillingManager getBillingManager() {
    return AppModule_ProvideBillingManagerFactory.proxyProvideBillingManager(
        appModule, billingManagerImplProvider.get());
  }

  private Map<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
      getMapOfClassOfAndProviderOfFactoryOf() {
    return MapBuilder
        .<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
            newMapBuilder(12)
        .put(MainActivity.class, (Provider) mainActivitySubcomponentBuilderProvider)
        .put(PlusActivity.class, (Provider) plusActivitySubcomponentBuilderProvider)
        .put(BackupActivity.class, (Provider) backupActivitySubcomponentBuilderProvider)
        .put(ComposeActivity.class, (Provider) composeActivitySubcomponentBuilderProvider)
        .put(ContactsActivity.class, (Provider) contactsActivitySubcomponentBuilderProvider)
        .put(
            ConversationInfoActivity.class,
            (Provider) conversationInfoActivitySubcomponentBuilderProvider)
        .put(GalleryActivity.class, (Provider) galleryActivitySubcomponentBuilderProvider)
        .put(
            NotificationPrefsActivity.class,
            (Provider) notificationPrefsActivitySubcomponentBuilderProvider)
        .put(QkReplyActivity.class, (Provider) qkReplyActivitySubcomponentBuilderProvider)
        .put(ScheduledActivity.class, (Provider) scheduledActivitySubcomponentBuilderProvider)
        .put(SettingsActivity.class, (Provider) settingsActivitySubcomponentBuilderProvider)
        .put(BlockingActivity.class, (Provider) blockingActivitySubcomponentBuilderProvider)
        .build();
  }

  private DispatchingAndroidInjector<Activity> getDispatchingAndroidInjectorOfActivity() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<? extends Activity>>>emptyMap());
  }

  private Map<
          Class<? extends BroadcastReceiver>,
          Provider<AndroidInjector.Factory<? extends BroadcastReceiver>>>
      getMapOfClassOfAndProviderOfFactoryOf2() {
    return MapBuilder
        .<Class<? extends BroadcastReceiver>,
            Provider<AndroidInjector.Factory<? extends BroadcastReceiver>>>
            newMapBuilder(20)
        .put(BlockThreadReceiver.class, (Provider) blockThreadReceiverSubcomponentBuilderProvider)
        .put(BootReceiver.class, (Provider) bootReceiverSubcomponentBuilderProvider)
        .put(
            DefaultSmsChangedReceiver.class,
            (Provider) defaultSmsChangedReceiverSubcomponentBuilderProvider)
        .put(
            DeleteMessagesReceiver.class,
            (Provider) deleteMessagesReceiverSubcomponentBuilderProvider)
        .put(MarkArchivedReceiver.class, (Provider) markArchivedReceiverSubcomponentBuilderProvider)
        .put(MarkReadReceiver.class, (Provider) markReadReceiverSubcomponentBuilderProvider)
        .put(MarkSeenReceiver.class, (Provider) markSeenReceiverSubcomponentBuilderProvider)
        .put(MmsReceivedReceiver.class, (Provider) mmsReceivedReceiverSubcomponentBuilderProvider)
        .put(MmsReceiver.class, (Provider) mmsReceiverSubcomponentBuilderProvider)
        .put(MmsSentReceiver.class, (Provider) mmsSentReceiverSubcomponentBuilderProvider)
        .put(MmsUpdatedReceiver.class, (Provider) mmsUpdatedReceiverSubcomponentBuilderProvider)
        .put(NightModeReceiver.class, (Provider) nightModeReceiverSubcomponentBuilderProvider)
        .put(
            RemoteMessagingReceiver.class,
            (Provider) remoteMessagingReceiverSubcomponentBuilderProvider)
        .put(
            SendScheduledMessageReceiver.class,
            (Provider) sendScheduledMessageReceiverSubcomponentBuilderProvider)
        .put(SmsDeliveredReceiver.class, (Provider) smsDeliveredReceiverSubcomponentBuilderProvider)
        .put(
            SmsProviderChangedReceiver.class,
            (Provider) smsProviderChangedReceiverSubcomponentBuilderProvider)
        .put(SmsReceiver.class, (Provider) smsReceiverSubcomponentBuilderProvider)
        .put(SmsSentReceiver.class, (Provider) smsSentReceiverSubcomponentBuilderProvider)
        .put(WidgetProvider.class, (Provider) widgetProviderSubcomponentBuilderProvider)
        .put(SendSmsReceiver.class, (Provider) sendSmsReceiverSubcomponentBuilderProvider)
        .build();
  }

  private DispatchingAndroidInjector<BroadcastReceiver>
      getDispatchingAndroidInjectorOfBroadcastReceiver() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf2(),
        Collections
            .<String, Provider<AndroidInjector.Factory<? extends BroadcastReceiver>>>emptyMap());
  }

  private Map<Class<? extends Service>, Provider<AndroidInjector.Factory<? extends Service>>>
      getMapOfClassOfAndProviderOfFactoryOf3() {
    return MapBuilder
        .<Class<? extends Service>, Provider<AndroidInjector.Factory<? extends Service>>>
            newMapBuilder(3)
        .put(AutoDeleteService.class, (Provider) autoDeleteServiceSubcomponentBuilderProvider)
        .put(
            HeadlessSmsSendService.class,
            (Provider) headlessSmsSendServiceSubcomponentBuilderProvider)
        .put(RestoreBackupService.class, (Provider) restoreBackupServiceSubcomponentBuilderProvider)
        .build();
  }

  private DispatchingAndroidInjector<Service> getDispatchingAndroidInjectorOfService() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf3(),
        Collections.<String, Provider<AndroidInjector.Factory<? extends Service>>>emptyMap());
  }

  private CursorToContactImpl getCursorToContactImpl() {
    return new CursorToContactImpl(provideContextProvider.get(), getPermissionManager());
  }

  private QkRealmMigration getQkRealmMigration() {
    return new QkRealmMigration(getCursorToContactImpl(), preferencesProvider.get());
  }

  private ReferralManager getReferralManager() {
    return AppModule_ProvideReferralManagerFactory.proxyProvideReferralManager(
        appModule, new ReferralManagerImpl());
  }

  private AboutPresenter getAboutPresenter() {
    return new AboutPresenter(navigatorProvider.get());
  }

  private BackupRepository getBackupRepository() {
    return AppModule_ProvideBackupRepositoryFactory.proxyProvideBackupRepository(
        appModule, backupRepositoryImplProvider.get());
  }

  private PerformBackup getPerformBackup() {
    return new PerformBackup(getBackupRepository());
  }

  private BackupPresenter getBackupPresenter() {
    return new BackupPresenter(
        getBackupRepository(),
        getBillingManager(),
        provideContextProvider.get(),
        dateFormatterProvider.get(),
        navigatorProvider.get(),
        getPerformBackup());
  }

  private BlockedMessagesAdapter getBlockedMessagesAdapter() {
    return new BlockedMessagesAdapter(provideContextProvider.get(), dateFormatterProvider.get());
  }

  private BlockingClient getBlockingClient() {
    return AppModule_BlockingClientFactory.proxyBlockingClient(
        appModule, blockingManagerProvider.get());
  }

  private MessageRepository getMessageRepository() {
    return AppModule_ProvideMessageRepositoryFactory.proxyProvideMessageRepository(
        appModule, messageRepositoryImplProvider.get());
  }

  private NotificationManager getNotificationManager() {
    return AppModule_ProvideNotificationsManagerFactory.proxyProvideNotificationsManager(
        appModule, notificationManagerImplProvider.get());
  }

  private ShortcutManagerImpl getShortcutManagerImpl() {
    return new ShortcutManagerImpl(
        provideContextProvider.get(), getConversationRepository(), getMessageRepository());
  }

  private ShortcutManager getShortcutManager() {
    return AppModule_ProvideShortcutManagerFactory.proxyProvideShortcutManager(
        appModule, getShortcutManagerImpl());
  }

  private WidgetManagerImpl getWidgetManagerImpl() {
    return new WidgetManagerImpl(provideContextProvider.get());
  }

  private WidgetManager getWidgetManager() {
    return AppModule_ProvideWidgetManagerFactory.proxyProvideWidgetManager(
        appModule, getWidgetManagerImpl());
  }

  private UpdateBadge getUpdateBadge() {
    return new UpdateBadge(getShortcutManager(), getWidgetManager());
  }

  private MarkRead getMarkRead() {
    return new MarkRead(getMessageRepository(), getNotificationManager(), getUpdateBadge());
  }

  private MarkBlocked getMarkBlocked() {
    return new MarkBlocked(getConversationRepository(), getMarkRead());
  }

  private MarkUnblocked getMarkUnblocked() {
    return new MarkUnblocked(getConversationRepository());
  }

  private BlockingDialog getBlockingDialog() {
    return new BlockingDialog(
        getBlockingClient(),
        provideContextProvider.get(),
        getConversationRepository(),
        preferencesProvider.get(),
        getMarkBlocked(),
        getMarkUnblocked());
  }

  private DeleteConversations getDeleteConversations() {
    return new DeleteConversations(
        getConversationRepository(), getNotificationManager(), getUpdateBadge());
  }

  private BlockedMessagesPresenter getBlockedMessagesPresenter() {
    return new BlockedMessagesPresenter(
        getConversationRepository(),
        getBlockingClient(),
        getDeleteConversations(),
        navigatorProvider.get());
  }

  private BlockedNumbersPresenter getBlockedNumbersPresenter() {
    return new BlockedNumbersPresenter(
        getBlockingRepository(), getConversationRepository(), getMarkUnblocked());
  }

  private BlockingPresenter getBlockingPresenter() {
    return new BlockingPresenter(
        provideContextProvider.get(), getBlockingClient(), preferencesProvider.get());
  }

  private CallBlockerBlockingClient getCallBlockerBlockingClient() {
    return new CallBlockerBlockingClient(provideContextProvider.get());
  }

  private CallControlBlockingClient getCallControlBlockingClient() {
    return new CallControlBlockingClient(provideContextProvider.get());
  }

  private ShouldIAnswerBlockingClient getShouldIAnswerBlockingClient() {
    return new ShouldIAnswerBlockingClient(provideContextProvider.get());
  }

  private BlockingManagerPresenter getBlockingManagerPresenter() {
    return new BlockingManagerPresenter(
        getAnalyticsManager(),
        getCallBlockerBlockingClient(),
        getCallControlBlockingClient(),
        provideContextProvider.get(),
        getConversationRepository(),
        navigatorProvider.get(),
        preferencesProvider.get(),
        getQksmsBlockingClient(),
        getShouldIAnswerBlockingClient());
  }

  private MenuItemAdapter getMenuItemAdapter() {
    return new MenuItemAdapter(provideContextProvider.get(), colorsProvider.get());
  }

  private QkDialog getQkDialog() {
    return new QkDialog(provideContextProvider.get(), getMenuItemAdapter());
  }

  private SyncRepository getSyncRepository() {
    return AppModule_ProvideSyncRepositoryFactory.proxyProvideSyncRepository(
        appModule, syncRepositoryImplProvider.get());
  }

  private DeleteOldMessages getDeleteOldMessages() {
    return new DeleteOldMessages(
        getConversationRepository(), getMessageRepository(), preferencesProvider.get());
  }

  private SyncMessages getSyncMessages() {
    return new SyncMessages(getSyncRepository(), getUpdateBadge());
  }

  private SettingsPresenter getSettingsPresenter() {
    return new SettingsPresenter(
        colorsProvider.get(),
        getSyncRepository(),
        getAnalyticsManager(),
        provideContextProvider.get(),
        getBillingManager(),
        dateFormatterProvider.get(),
        getDeleteOldMessages(),
        getMessageRepository(),
        navigatorProvider.get(),
        nightModeManagerProvider.get(),
        preferencesProvider.get(),
        getSyncMessages());
  }

  private SwipeActionsPresenter getSwipeActionsPresenter() {
    return new SwipeActionsPresenter(provideContextProvider.get(), preferencesProvider.get());
  }

  private TextViewStyler getTextViewStyler() {
    return new TextViewStyler(preferencesProvider.get(), colorsProvider.get(), fontProvider.get());
  }

  private ContactRepository getContactRepository() {
    return AppModule_ProvideContactRepositoryFactory.proxyProvideContactRepository(
        appModule, contactRepositoryImplProvider.get());
  }

  private AlarmManagerImpl getAlarmManagerImpl() {
    return new AlarmManagerImpl(provideContextProvider.get());
  }

  private AlarmManager getAlarmManager() {
    return AppModule_ProvideAlarmManagerFactory.proxyProvideAlarmManager(
        appModule, getAlarmManagerImpl());
  }

  private ScheduledMessageRepository getScheduledMessageRepository() {
    return AppModule_ProvideScheduledMessagesRepositoryFactory
        .proxyProvideScheduledMessagesRepository(appModule, new ScheduledMessageRepositoryImpl());
  }

  private ActiveConversationManager getActiveConversationManager() {
    return AppModule_ProvideActiveConversationManagerFactory.proxyProvideActiveConversationManager(
        appModule, activeConversationManagerImplProvider.get());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.appModule = builder.appModule;
    this.analyticsManagerImplProvider = DoubleCheck.provider(AnalyticsManagerImpl_Factory.create());
    this.provideContextProvider =
        DoubleCheck.provider(AppModule_ProvideContextFactory.create(builder.appModule));
    this.phoneNumberUtilsProvider =
        DoubleCheck.provider(PhoneNumberUtils_Factory.create(provideContextProvider));
    this.provideSharedPreferencesProvider =
        DoubleCheck.provider(
            AppModule_ProvideSharedPreferencesFactory.create(
                builder.appModule, provideContextProvider));
    this.provideRxPreferencesProvider =
        DoubleCheck.provider(
            AppModule_ProvideRxPreferencesFactory.create(
                builder.appModule, provideSharedPreferencesProvider));
    this.preferencesProvider =
        DoubleCheck.provider(
            Preferences_Factory.create(
                provideContextProvider,
                provideRxPreferencesProvider,
                provideSharedPreferencesProvider));
    this.billingManagerImplProvider = DoubleCheck.provider(BillingManagerImpl_Factory.create());
    this.mainActivitySubcomponentBuilderProvider =
        new Provider<ActivityBuilderModule_BindMainActivity.MainActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilderModule_BindMainActivity.MainActivitySubcomponent.Builder get() {
            return new MainActivitySubcomponentBuilder();
          }
        };
    this.plusActivitySubcomponentBuilderProvider =
        new Provider<ActivityBuilderModule_BindPlusActivity.PlusActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilderModule_BindPlusActivity.PlusActivitySubcomponent.Builder get() {
            return new PlusActivitySubcomponentBuilder();
          }
        };
    this.backupActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBuilderModule_BindBackupActivity.BackupActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilderModule_BindBackupActivity.BackupActivitySubcomponent.Builder get() {
            return new BackupActivitySubcomponentBuilder();
          }
        };
    this.composeActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBuilderModule_BindComposeActivity.ComposeActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilderModule_BindComposeActivity.ComposeActivitySubcomponent.Builder
              get() {
            return new ComposeActivitySubcomponentBuilder();
          }
        };
    this.contactsActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBuilderModule_BindContactsActivity.ContactsActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilderModule_BindContactsActivity.ContactsActivitySubcomponent.Builder
              get() {
            return new ContactsActivitySubcomponentBuilder();
          }
        };
    this.conversationInfoActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBuilderModule_BindConversationInfoActivity.ConversationInfoActivitySubcomponent
                .Builder>() {
          @Override
          public ActivityBuilderModule_BindConversationInfoActivity
                  .ConversationInfoActivitySubcomponent.Builder
              get() {
            return new ConversationInfoActivitySubcomponentBuilder();
          }
        };
    this.galleryActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBuilderModule_BindGalleryActivity.GalleryActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilderModule_BindGalleryActivity.GalleryActivitySubcomponent.Builder
              get() {
            return new GalleryActivitySubcomponentBuilder();
          }
        };
    this.notificationPrefsActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBuilderModule_BindNotificationPrefsActivity
                .NotificationPrefsActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilderModule_BindNotificationPrefsActivity
                  .NotificationPrefsActivitySubcomponent.Builder
              get() {
            return new NotificationPrefsActivitySubcomponentBuilder();
          }
        };
    this.qkReplyActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBuilderModule_BindQkReplyActivity.QkReplyActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilderModule_BindQkReplyActivity.QkReplyActivitySubcomponent.Builder
              get() {
            return new QkReplyActivitySubcomponentBuilder();
          }
        };
    this.scheduledActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBuilderModule_BindScheduledActivity.ScheduledActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilderModule_BindScheduledActivity.ScheduledActivitySubcomponent.Builder
              get() {
            return new ScheduledActivitySubcomponentBuilder();
          }
        };
    this.settingsActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBuilderModule_BindSettingsActivity.SettingsActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilderModule_BindSettingsActivity.SettingsActivitySubcomponent.Builder
              get() {
            return new SettingsActivitySubcomponentBuilder();
          }
        };
    this.blockingActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBuilderModule_BindBlockingActivity.BlockingActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilderModule_BindBlockingActivity.BlockingActivitySubcomponent.Builder
              get() {
            return new BlockingActivitySubcomponentBuilder();
          }
        };
    this.blockThreadReceiverSubcomponentBuilderProvider =
        new Provider<
            BroadcastReceiverBuilderModule_BindBlockThreadReceiver.BlockThreadReceiverSubcomponent
                .Builder>() {
          @Override
          public BroadcastReceiverBuilderModule_BindBlockThreadReceiver
                  .BlockThreadReceiverSubcomponent.Builder
              get() {
            return new BlockThreadReceiverSubcomponentBuilder();
          }
        };
    this.bootReceiverSubcomponentBuilderProvider =
        new Provider<
            BroadcastReceiverBuilderModule_BindBootReceiver.BootReceiverSubcomponent.Builder>() {
          @Override
          public BroadcastReceiverBuilderModule_BindBootReceiver.BootReceiverSubcomponent.Builder
              get() {
            return new BootReceiverSubcomponentBuilder();
          }
        };
    this.defaultSmsChangedReceiverSubcomponentBuilderProvider =
        new Provider<
            BroadcastReceiverBuilderModule_BindDefaultSmsChangedReceiver
                .DefaultSmsChangedReceiverSubcomponent.Builder>() {
          @Override
          public BroadcastReceiverBuilderModule_BindDefaultSmsChangedReceiver
                  .DefaultSmsChangedReceiverSubcomponent.Builder
              get() {
            return new DefaultSmsChangedReceiverSubcomponentBuilder();
          }
        };
    this.deleteMessagesReceiverSubcomponentBuilderProvider =
        new Provider<
            BroadcastReceiverBuilderModule_BindDeleteMessagesReceiver
                .DeleteMessagesReceiverSubcomponent.Builder>() {
          @Override
          public BroadcastReceiverBuilderModule_BindDeleteMessagesReceiver
                  .DeleteMessagesReceiverSubcomponent.Builder
              get() {
            return new DeleteMessagesReceiverSubcomponentBuilder();
          }
        };
    this.markArchivedReceiverSubcomponentBuilderProvider =
        new Provider<
            BroadcastReceiverBuilderModule_BindMarkArchivedReceiver.MarkArchivedReceiverSubcomponent
                .Builder>() {
          @Override
          public BroadcastReceiverBuilderModule_BindMarkArchivedReceiver
                  .MarkArchivedReceiverSubcomponent.Builder
              get() {
            return new MarkArchivedReceiverSubcomponentBuilder();
          }
        };
    this.markReadReceiverSubcomponentBuilderProvider =
        new Provider<
            BroadcastReceiverBuilderModule_BindMarkReadReceiver.MarkReadReceiverSubcomponent
                .Builder>() {
          @Override
          public BroadcastReceiverBuilderModule_BindMarkReadReceiver.MarkReadReceiverSubcomponent
                  .Builder
              get() {
            return new MarkReadReceiverSubcomponentBuilder();
          }
        };
    this.markSeenReceiverSubcomponentBuilderProvider =
        new Provider<
            BroadcastReceiverBuilderModule_BindMarkSeenReceiver.MarkSeenReceiverSubcomponent
                .Builder>() {
          @Override
          public BroadcastReceiverBuilderModule_BindMarkSeenReceiver.MarkSeenReceiverSubcomponent
                  .Builder
              get() {
            return new MarkSeenReceiverSubcomponentBuilder();
          }
        };
    this.mmsReceivedReceiverSubcomponentBuilderProvider =
        new Provider<
            BroadcastReceiverBuilderModule_BindMmsReceivedReceiver.MmsReceivedReceiverSubcomponent
                .Builder>() {
          @Override
          public BroadcastReceiverBuilderModule_BindMmsReceivedReceiver
                  .MmsReceivedReceiverSubcomponent.Builder
              get() {
            return new MmsReceivedReceiverSubcomponentBuilder();
          }
        };
    this.mmsReceiverSubcomponentBuilderProvider =
        new Provider<
            BroadcastReceiverBuilderModule_BindMmsReceiver.MmsReceiverSubcomponent.Builder>() {
          @Override
          public BroadcastReceiverBuilderModule_BindMmsReceiver.MmsReceiverSubcomponent.Builder
              get() {
            return new MmsReceiverSubcomponentBuilder();
          }
        };
    this.mmsSentReceiverSubcomponentBuilderProvider =
        new Provider<
            BroadcastReceiverBuilderModule_BindMmsSentReceiver.MmsSentReceiverSubcomponent
                .Builder>() {
          @Override
          public BroadcastReceiverBuilderModule_BindMmsSentReceiver.MmsSentReceiverSubcomponent
                  .Builder
              get() {
            return new MmsSentReceiverSubcomponentBuilder();
          }
        };
    this.mmsUpdatedReceiverSubcomponentBuilderProvider =
        new Provider<
            BroadcastReceiverBuilderModule_BindMmsUpdatedReceiver.MmsUpdatedReceiverSubcomponent
                .Builder>() {
          @Override
          public BroadcastReceiverBuilderModule_BindMmsUpdatedReceiver
                  .MmsUpdatedReceiverSubcomponent.Builder
              get() {
            return new MmsUpdatedReceiverSubcomponentBuilder();
          }
        };
    this.nightModeReceiverSubcomponentBuilderProvider =
        new Provider<
            BroadcastReceiverBuilderModule_BindNightModeReceiver.NightModeReceiverSubcomponent
                .Builder>() {
          @Override
          public BroadcastReceiverBuilderModule_BindNightModeReceiver.NightModeReceiverSubcomponent
                  .Builder
              get() {
            return new NightModeReceiverSubcomponentBuilder();
          }
        };
    this.remoteMessagingReceiverSubcomponentBuilderProvider =
        new Provider<
            BroadcastReceiverBuilderModule_BindRemoteMessagingReceiver
                .RemoteMessagingReceiverSubcomponent.Builder>() {
          @Override
          public BroadcastReceiverBuilderModule_BindRemoteMessagingReceiver
                  .RemoteMessagingReceiverSubcomponent.Builder
              get() {
            return new RemoteMessagingReceiverSubcomponentBuilder();
          }
        };
    this.sendScheduledMessageReceiverSubcomponentBuilderProvider =
        new Provider<
            BroadcastReceiverBuilderModule_BindSendScheduledMessageReceiver
                .SendScheduledMessageReceiverSubcomponent.Builder>() {
          @Override
          public BroadcastReceiverBuilderModule_BindSendScheduledMessageReceiver
                  .SendScheduledMessageReceiverSubcomponent.Builder
              get() {
            return new SendScheduledMessageReceiverSubcomponentBuilder();
          }
        };
    this.smsDeliveredReceiverSubcomponentBuilderProvider =
        new Provider<
            BroadcastReceiverBuilderModule_BindSmsDeliveredReceiver.SmsDeliveredReceiverSubcomponent
                .Builder>() {
          @Override
          public BroadcastReceiverBuilderModule_BindSmsDeliveredReceiver
                  .SmsDeliveredReceiverSubcomponent.Builder
              get() {
            return new SmsDeliveredReceiverSubcomponentBuilder();
          }
        };
    this.smsProviderChangedReceiverSubcomponentBuilderProvider =
        new Provider<
            BroadcastReceiverBuilderModule_BindSmsProviderChangedReceiver
                .SmsProviderChangedReceiverSubcomponent.Builder>() {
          @Override
          public BroadcastReceiverBuilderModule_BindSmsProviderChangedReceiver
                  .SmsProviderChangedReceiverSubcomponent.Builder
              get() {
            return new SmsProviderChangedReceiverSubcomponentBuilder();
          }
        };
    this.smsReceiverSubcomponentBuilderProvider =
        new Provider<
            BroadcastReceiverBuilderModule_BindSmsReceiver.SmsReceiverSubcomponent.Builder>() {
          @Override
          public BroadcastReceiverBuilderModule_BindSmsReceiver.SmsReceiverSubcomponent.Builder
              get() {
            return new SmsReceiverSubcomponentBuilder();
          }
        };
    this.smsSentReceiverSubcomponentBuilderProvider =
        new Provider<
            BroadcastReceiverBuilderModule_BindSmsSentReceiver.SmsSentReceiverSubcomponent
                .Builder>() {
          @Override
          public BroadcastReceiverBuilderModule_BindSmsSentReceiver.SmsSentReceiverSubcomponent
                  .Builder
              get() {
            return new SmsSentReceiverSubcomponentBuilder();
          }
        };
    this.widgetProviderSubcomponentBuilderProvider =
        new Provider<
            BroadcastReceiverBuilderModule_BindWidgetProvider.WidgetProviderSubcomponent
                .Builder>() {
          @Override
          public BroadcastReceiverBuilderModule_BindWidgetProvider.WidgetProviderSubcomponent
                  .Builder
              get() {
            return new WidgetProviderSubcomponentBuilder();
          }
        };
    this.sendSmsReceiverSubcomponentBuilderProvider =
        new Provider<
            ServiceBuilderModule_BindSendSmsReceiver.SendSmsReceiverSubcomponent.Builder>() {
          @Override
          public ServiceBuilderModule_BindSendSmsReceiver.SendSmsReceiverSubcomponent.Builder
              get() {
            return new SendSmsReceiverSubcomponentBuilder();
          }
        };
    this.autoDeleteServiceSubcomponentBuilderProvider =
        new Provider<
            ServiceBuilderModule_BindAutoDeleteService.AutoDeleteServiceSubcomponent.Builder>() {
          @Override
          public ServiceBuilderModule_BindAutoDeleteService.AutoDeleteServiceSubcomponent.Builder
              get() {
            return new AutoDeleteServiceSubcomponentBuilder();
          }
        };
    this.headlessSmsSendServiceSubcomponentBuilderProvider =
        new Provider<
            ServiceBuilderModule_BindHeadlessSmsSendService.HeadlessSmsSendServiceSubcomponent
                .Builder>() {
          @Override
          public ServiceBuilderModule_BindHeadlessSmsSendService.HeadlessSmsSendServiceSubcomponent
                  .Builder
              get() {
            return new HeadlessSmsSendServiceSubcomponentBuilder();
          }
        };
    this.restoreBackupServiceSubcomponentBuilderProvider =
        new Provider<
            ServiceBuilderModule_BindRestoreBackupService.RestoreBackupServiceSubcomponent
                .Builder>() {
          @Override
          public ServiceBuilderModule_BindRestoreBackupService.RestoreBackupServiceSubcomponent
                  .Builder
              get() {
            return new RestoreBackupServiceSubcomponentBuilder();
          }
        };
    this.fileLoggingTreeProvider =
        DoubleCheck.provider(FileLoggingTree_Factory.create(preferencesProvider));
    this.widgetManagerImplProvider = WidgetManagerImpl_Factory.create(provideContextProvider);
    this.provideWidgetManagerProvider =
        AppModule_ProvideWidgetManagerFactory.create(builder.appModule, widgetManagerImplProvider);
    this.nightModeManagerProvider =
        DoubleCheck.provider(
            NightModeManager_Factory.create(
                provideContextProvider, preferencesProvider, provideWidgetManagerProvider));
    this.provideAnalyticsManagerProvider =
        AppModule_ProvideAnalyticsManagerFactory.create(
            builder.appModule, analyticsManagerImplProvider);
    this.provideBillingManagerProvider =
        AppModule_ProvideBillingManagerFactory.create(
            builder.appModule, billingManagerImplProvider);
    this.colorsProvider =
        DoubleCheck.provider(
            Colors_Factory.create(
                provideContextProvider, phoneNumberUtilsProvider, preferencesProvider));
    this.phoneNumberFilterProvider = PhoneNumberFilter_Factory.create(phoneNumberUtilsProvider);
    this.contactFilterProvider = ContactFilter_Factory.create(phoneNumberFilterProvider);
    this.recipientFilterProvider =
        RecipientFilter_Factory.create(contactFilterProvider, phoneNumberFilterProvider);
    this.conversationFilterProvider = ConversationFilter_Factory.create(recipientFilterProvider);
    this.permissionManagerImplProvider =
        PermissionManagerImpl_Factory.create(provideContextProvider);
    this.providePermissionsManagerProvider =
        AppModule_ProvidePermissionsManagerFactory.create(
            builder.appModule, permissionManagerImplProvider);
    this.cursorToConversationImplProvider =
        CursorToConversationImpl_Factory.create(
            provideContextProvider, providePermissionsManagerProvider);
    this.provideCursorToConversationProvider =
        AppModule_ProvideCursorToConversationFactory.create(
            builder.appModule, cursorToConversationImplProvider);
    this.cursorToRecipientImplProvider =
        CursorToRecipientImpl_Factory.create(
            provideContextProvider, providePermissionsManagerProvider);
    this.provideCursorToRecipientProvider =
        AppModule_ProvideCursorToRecipientFactory.create(
            builder.appModule, cursorToRecipientImplProvider);
    this.conversationRepositoryImplProvider =
        ConversationRepositoryImpl_Factory.create(
            provideContextProvider,
            conversationFilterProvider,
            provideCursorToConversationProvider,
            provideCursorToRecipientProvider,
            phoneNumberUtilsProvider);
    this.provideConversationRepositoryProvider =
        AppModule_ProvideConversationRepositoryFactory.create(
            builder.appModule, conversationRepositoryImplProvider);
    this.activeConversationManagerImplProvider =
        DoubleCheck.provider(ActiveConversationManagerImpl_Factory.create());
    this.provideActiveConversationManagerProvider =
        AppModule_ProvideActiveConversationManagerFactory.create(
            builder.appModule, activeConversationManagerImplProvider);
    this.keyManagerImplProvider = DoubleCheck.provider(KeyManagerImpl_Factory.create());
    this.provideKeyManagerProvider =
        AppModule_ProvideKeyManagerFactory.create(builder.appModule, keyManagerImplProvider);
    this.provideContentResolverProvider =
        AppModule_ProvideContentResolverFactory.create(builder.appModule, provideContextProvider);
    this.cursorToPartImplProvider = CursorToPartImpl_Factory.create(provideContextProvider);
    this.provideCursorToPartProvider =
        AppModule_ProvideCursorToPartFactory.create(builder.appModule, cursorToPartImplProvider);
    this.cursorToMessageImplProvider =
        CursorToMessageImpl_Factory.create(
            provideContextProvider,
            provideCursorToPartProvider,
            provideKeyManagerProvider,
            providePermissionsManagerProvider,
            preferencesProvider);
    this.provideCursorToMessageProvider =
        AppModule_ProvideCursorToMessageFactory.create(
            builder.appModule, cursorToMessageImplProvider);
    this.cursorToContactImplProvider =
        CursorToContactImpl_Factory.create(
            provideContextProvider, providePermissionsManagerProvider);
    this.provideCursorToContactProvider =
        AppModule_ProvideCursorToContactFactory.create(
            builder.appModule, cursorToContactImplProvider);
    this.cursorToContactGroupImplProvider =
        CursorToContactGroupImpl_Factory.create(provideContextProvider);
    this.provideCursorToContactGroupProvider =
        AppModule_ProvideCursorToContactGroupFactory.create(
            builder.appModule, cursorToContactGroupImplProvider);
    this.cursorToContactGroupMemberImplProvider =
        CursorToContactGroupMemberImpl_Factory.create(provideContextProvider);
    this.provideCursorToContactGroupMemberProvider =
        AppModule_ProvideCursorToContactGroupMemberFactory.create(
            builder.appModule, cursorToContactGroupMemberImplProvider);
    this.syncRepositoryImplProvider =
        DoubleCheck.provider(
            SyncRepositoryImpl_Factory.create(
                provideContentResolverProvider,
                provideConversationRepositoryProvider,
                provideCursorToConversationProvider,
                provideCursorToMessageProvider,
                provideCursorToPartProvider,
                provideCursorToRecipientProvider,
                provideCursorToContactProvider,
                provideCursorToContactGroupProvider,
                provideCursorToContactGroupMemberProvider,
                provideKeyManagerProvider,
                phoneNumberUtilsProvider,
                provideRxPreferencesProvider));
    this.provideSyncRepositoryProvider =
        AppModule_ProvideSyncRepositoryFactory.create(
            builder.appModule, syncRepositoryImplProvider);
    this.messageRepositoryImplProvider =
        DoubleCheck.provider(
            MessageRepositoryImpl_Factory.create(
                provideActiveConversationManagerProvider,
                provideContextProvider,
                provideKeyManagerProvider,
                phoneNumberUtilsProvider,
                preferencesProvider,
                provideSyncRepositoryProvider));
    this.provideMessageRepositoryProvider =
        AppModule_ProvideMessageRepositoryFactory.create(
            builder.appModule, messageRepositoryImplProvider);
    this.notificationManagerImplProvider =
        DoubleCheck.provider(
            NotificationManagerImpl_Factory.create(
                provideContextProvider,
                colorsProvider,
                provideConversationRepositoryProvider,
                preferencesProvider,
                provideMessageRepositoryProvider,
                providePermissionsManagerProvider,
                phoneNumberUtilsProvider));
    this.provideNotificationsManagerProvider =
        AppModule_ProvideNotificationsManagerFactory.create(
            builder.appModule, notificationManagerImplProvider);
    this.navigatorProvider =
        DoubleCheck.provider(
            Navigator_Factory.create(
                provideContextProvider,
                provideAnalyticsManagerProvider,
                provideBillingManagerProvider,
                provideNotificationsManagerProvider,
                providePermissionsManagerProvider));
    this.provideMoshiProvider =
        DoubleCheck.provider(AppModule_ProvideMoshiFactory.create(builder.appModule));
    this.backupRepositoryImplProvider =
        DoubleCheck.provider(
            BackupRepositoryImpl_Factory.create(
                provideContextProvider,
                provideMoshiProvider,
                preferencesProvider,
                provideSyncRepositoryProvider));
    this.dateFormatterProvider =
        DoubleCheck.provider(DateFormatter_Factory.create(provideContextProvider));
    this.callBlockerBlockingClientProvider =
        CallBlockerBlockingClient_Factory.create(provideContextProvider);
    this.callControlBlockingClientProvider =
        CallControlBlockingClient_Factory.create(provideContextProvider);
    this.blockingRepositoryImplProvider =
        BlockingRepositoryImpl_Factory.create(phoneNumberUtilsProvider);
    this.provideBlockingRepositoryProvider =
        AppModule_ProvideBlockingRepositoryFactory.create(
            builder.appModule, blockingRepositoryImplProvider);
    this.qksmsBlockingClientProvider =
        QksmsBlockingClient_Factory.create(provideBlockingRepositoryProvider);
    this.shouldIAnswerBlockingClientProvider =
        ShouldIAnswerBlockingClient_Factory.create(provideContextProvider);
    this.blockingManagerProvider =
        DoubleCheck.provider(
            BlockingManager_Factory.create(
                preferencesProvider,
                callBlockerBlockingClientProvider,
                callControlBlockingClientProvider,
                qksmsBlockingClientProvider,
                shouldIAnswerBlockingClientProvider));
    this.fontProvider = DoubleCheck.provider(FontProvider_Factory.create(provideContextProvider));
    this.contactAddedListenerImplProvider =
        ContactAddedListenerImpl_Factory.create(provideContextProvider);
    this.provideContactAddedListenerProvider =
        AppModule_ProvideContactAddedListenerFactory.create(
            builder.appModule, contactAddedListenerImplProvider);
    this.changelogManagerImplProvider =
        ChangelogManagerImpl_Factory.create(
            provideContextProvider, provideMoshiProvider, preferencesProvider);
    this.changelogManagerProvider =
        AppModule_ChangelogManagerFactory.create(builder.appModule, changelogManagerImplProvider);
    this.shortcutManagerImplProvider =
        ShortcutManagerImpl_Factory.create(
            provideContextProvider,
            provideConversationRepositoryProvider,
            provideMessageRepositoryProvider);
  }

  @SuppressWarnings("unchecked")
  private void initialize2(final Builder builder) {
    this.provideShortcutManagerProvider =
        AppModule_ProvideShortcutManagerFactory.create(
            builder.appModule, shortcutManagerImplProvider);
    this.updateBadgeProvider =
        UpdateBadge_Factory.create(provideShortcutManagerProvider, provideWidgetManagerProvider);
    this.deleteConversationsProvider =
        DeleteConversations_Factory.create(
            provideConversationRepositoryProvider,
            provideNotificationsManagerProvider,
            updateBadgeProvider);
    this.markReadProvider =
        MarkRead_Factory.create(
            provideMessageRepositoryProvider,
            provideNotificationsManagerProvider,
            updateBadgeProvider);
    this.ratingManagerImplProvider =
        RatingManagerImpl_Factory.create(
            provideRxPreferencesProvider, provideAnalyticsManagerProvider);
    this.provideRatingManagerProvider =
        AppModule_ProvideRatingManagerFactory.create(builder.appModule, ratingManagerImplProvider);
    this.syncMessagesProvider =
        SyncMessages_Factory.create(provideSyncRepositoryProvider, updateBadgeProvider);
    this.contactRepositoryImplProvider =
        DoubleCheck.provider(
            ContactRepositoryImpl_Factory.create(provideContextProvider, preferencesProvider));
    this.provideContactRepositoryProvider =
        AppModule_ProvideContactRepositoryFactory.create(
            builder.appModule, contactRepositoryImplProvider);
    this.provideScheduledMessagesRepositoryProvider =
        AppModule_ProvideScheduledMessagesRepositoryFactory.create(
            builder.appModule, ScheduledMessageRepositoryImpl_Factory.create());
    this.alarmManagerImplProvider = AlarmManagerImpl_Factory.create(provideContextProvider);
    this.provideAlarmManagerProvider =
        AppModule_ProvideAlarmManagerFactory.create(builder.appModule, alarmManagerImplProvider);
  }

  @Override
  public ConversationInfoComponent.Builder conversationInfoBuilder() {
    return new ConversationInfoComponentBuilder();
  }

  @Override
  public ThemePickerComponent.Builder themePickerBuilder() {
    return new ThemePickerComponentBuilder();
  }

  @Override
  public void inject(QKApplication application) {
    injectQKApplication(application);
  }

  @Override
  public void inject(AboutController controller) {
    injectAboutController(controller);
  }

  @Override
  public void inject(BackupController controller) {
    injectBackupController(controller);
  }

  @Override
  public void inject(BlockedMessagesController controller) {
    injectBlockedMessagesController(controller);
  }

  @Override
  public void inject(BlockedNumbersController controller) {
    injectBlockedNumbersController(controller);
  }

  @Override
  public void inject(BlockingController controller) {
    injectBlockingController(controller);
  }

  @Override
  public void inject(BlockingManagerController controller) {
    injectBlockingManagerController(controller);
  }

  @Override
  public void inject(SettingsController controller) {
    injectSettingsController(controller);
  }

  @Override
  public void inject(SwipeActionsController controller) {
    injectSwipeActionsController(controller);
  }

  @Override
  public void inject(QkDialog dialog) {}

  @Override
  public void inject(WidgetAdapter service) {
    injectWidgetAdapter(service);
  }

  @Override
  public void inject(QkChooserTargetService service) {
    injectQkChooserTargetService(service);
  }

  @Override
  public void inject(AvatarView view) {
    injectAvatarView(view);
  }

  @Override
  public void inject(DetailedChipView view) {
    injectDetailedChipView(view);
  }

  @Override
  public void inject(PagerTitleView view) {
    injectPagerTitleView(view);
  }

  @Override
  public void inject(PreferenceView view) {}

  @Override
  public void inject(RadioPreferenceView view) {
    injectRadioPreferenceView(view);
  }

  @Override
  public void inject(QkEditText view) {
    injectQkEditText(view);
  }

  @Override
  public void inject(QkSwitch view) {
    injectQkSwitch(view);
  }

  @Override
  public void inject(QkTextView view) {
    injectQkTextView(view);
  }

  private QKApplication injectQKApplication(QKApplication instance) {
    QKApplication_MembersInjector.injectAnalyticsManager(instance, getAnalyticsManager());
    QKApplication_MembersInjector.injectQkMigration(instance, getQkMigration());
    QKApplication_MembersInjector.injectBillingManager(instance, getBillingManager());
    QKApplication_MembersInjector.injectDispatchingActivityInjector(
        instance, getDispatchingAndroidInjectorOfActivity());
    QKApplication_MembersInjector.injectDispatchingBroadcastReceiverInjector(
        instance, getDispatchingAndroidInjectorOfBroadcastReceiver());
    QKApplication_MembersInjector.injectDispatchingServiceInjector(
        instance, getDispatchingAndroidInjectorOfService());
    QKApplication_MembersInjector.injectFileLoggingTree(instance, fileLoggingTreeProvider.get());
    QKApplication_MembersInjector.injectNightModeManager(instance, nightModeManagerProvider.get());
    QKApplication_MembersInjector.injectRealmMigration(instance, getQkRealmMigration());
    QKApplication_MembersInjector.injectReferralManager(instance, getReferralManager());
    return instance;
  }

  private AboutController injectAboutController(AboutController instance) {
    AboutController_MembersInjector.injectPresenter(instance, getAboutPresenter());
    return instance;
  }

  private BackupController injectBackupController(BackupController instance) {
    BackupController_MembersInjector.injectPresenter(instance, getBackupPresenter());
    return instance;
  }

  private BlockedMessagesController injectBlockedMessagesController(
      BlockedMessagesController instance) {
    BlockedMessagesController_MembersInjector.injectBlockedMessagesAdapter(
        instance, getBlockedMessagesAdapter());
    BlockedMessagesController_MembersInjector.injectBlockingDialog(instance, getBlockingDialog());
    BlockedMessagesController_MembersInjector.injectColors(instance, colorsProvider.get());
    BlockedMessagesController_MembersInjector.injectContext(instance, provideContextProvider.get());
    BlockedMessagesController_MembersInjector.injectPresenter(
        instance, getBlockedMessagesPresenter());
    return instance;
  }

  private BlockedNumbersController injectBlockedNumbersController(
      BlockedNumbersController instance) {
    BlockedNumbersController_MembersInjector.injectPresenter(
        instance, getBlockedNumbersPresenter());
    BlockedNumbersController_MembersInjector.injectColors(instance, colorsProvider.get());
    BlockedNumbersController_MembersInjector.injectPhoneNumberUtils(
        instance, phoneNumberUtilsProvider.get());
    return instance;
  }

  private BlockingController injectBlockingController(BlockingController instance) {
    BlockingController_MembersInjector.injectColors(instance, colorsProvider.get());
    BlockingController_MembersInjector.injectPresenter(instance, getBlockingPresenter());
    return instance;
  }

  private BlockingManagerController injectBlockingManagerController(
      BlockingManagerController instance) {
    BlockingManagerController_MembersInjector.injectColors(instance, colorsProvider.get());
    BlockingManagerController_MembersInjector.injectPresenter(
        instance, getBlockingManagerPresenter());
    return instance;
  }

  private SettingsController injectSettingsController(SettingsController instance) {
    SettingsController_MembersInjector.injectContext(instance, provideContextProvider.get());
    SettingsController_MembersInjector.injectColors(instance, colorsProvider.get());
    SettingsController_MembersInjector.injectNightModeDialog(instance, getQkDialog());
    SettingsController_MembersInjector.injectTextSizeDialog(instance, getQkDialog());
    SettingsController_MembersInjector.injectSendDelayDialog(instance, getQkDialog());
    SettingsController_MembersInjector.injectMmsSizeDialog(instance, getQkDialog());
    SettingsController_MembersInjector.injectPresenter(instance, getSettingsPresenter());
    return instance;
  }

  private SwipeActionsController injectSwipeActionsController(SwipeActionsController instance) {
    SwipeActionsController_MembersInjector.injectPresenter(instance, getSwipeActionsPresenter());
    SwipeActionsController_MembersInjector.injectActionsDialog(instance, getQkDialog());
    SwipeActionsController_MembersInjector.injectColors(instance, colorsProvider.get());
    return instance;
  }

  private WidgetAdapter injectWidgetAdapter(WidgetAdapter instance) {
    WidgetAdapter_MembersInjector.injectContext(instance, provideContextProvider.get());
    WidgetAdapter_MembersInjector.injectColors(instance, colorsProvider.get());
    WidgetAdapter_MembersInjector.injectConversationRepo(instance, getConversationRepository());
    WidgetAdapter_MembersInjector.injectDateFormatter(instance, dateFormatterProvider.get());
    WidgetAdapter_MembersInjector.injectPrefs(instance, preferencesProvider.get());
    return instance;
  }

  private QkChooserTargetService injectQkChooserTargetService(QkChooserTargetService instance) {
    QkChooserTargetService_MembersInjector.injectConversationRepo(
        instance, getConversationRepository());
    return instance;
  }

  private AvatarView injectAvatarView(AvatarView instance) {
    AvatarView_MembersInjector.injectColors(instance, colorsProvider.get());
    AvatarView_MembersInjector.injectNavigator(instance, navigatorProvider.get());
    return instance;
  }

  private DetailedChipView injectDetailedChipView(DetailedChipView instance) {
    DetailedChipView_MembersInjector.injectColors(instance, colorsProvider.get());
    return instance;
  }

  private PagerTitleView injectPagerTitleView(PagerTitleView instance) {
    PagerTitleView_MembersInjector.injectColors(instance, colorsProvider.get());
    PagerTitleView_MembersInjector.injectConversationRepo(instance, getConversationRepository());
    return instance;
  }

  private RadioPreferenceView injectRadioPreferenceView(RadioPreferenceView instance) {
    RadioPreferenceView_MembersInjector.injectColors(instance, colorsProvider.get());
    return instance;
  }

  private QkEditText injectQkEditText(QkEditText instance) {
    QkEditText_MembersInjector.injectTextViewStyler(instance, getTextViewStyler());
    return instance;
  }

  private QkSwitch injectQkSwitch(QkSwitch instance) {
    QkSwitch_MembersInjector.injectColors(instance, colorsProvider.get());
    QkSwitch_MembersInjector.injectPrefs(instance, preferencesProvider.get());
    return instance;
  }

  private QkTextView injectQkTextView(QkTextView instance) {
    QkTextView_MembersInjector.injectTextViewStyler(instance, getTextViewStyler());
    return instance;
  }

  public static final class Builder {
    private AppModule appModule;

    private Builder() {}

    public AppComponent build() {
      if (appModule == null) {
        throw new IllegalStateException(AppModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }
  }

  private final class ConversationInfoComponentBuilder
      implements ConversationInfoComponent.Builder {
    private ConversationInfoModule conversationInfoModule;

    @Override
    public ConversationInfoComponent build() {
      if (conversationInfoModule == null) {
        throw new IllegalStateException(
            ConversationInfoModule.class.getCanonicalName() + " must be set");
      }
      return new ConversationInfoComponentImpl(this);
    }

    @Override
    public ConversationInfoComponentBuilder conversationInfoModule(ConversationInfoModule module) {
      this.conversationInfoModule = Preconditions.checkNotNull(module);
      return this;
    }
  }

  private final class ConversationInfoComponentImpl implements ConversationInfoComponent {
    private Provider<Long> provideThreadIdProvider;

    private ConversationInfoComponentImpl(ConversationInfoComponentBuilder builder) {
      initialize(builder);
    }

    private MarkArchived getMarkArchived() {
      return new MarkArchived(
          DaggerAppComponent.this.getConversationRepository(),
          DaggerAppComponent.this.getMarkRead());
    }

    private MarkUnarchived getMarkUnarchived() {
      return new MarkUnarchived(DaggerAppComponent.this.getConversationRepository());
    }

    private ConversationInfoPresenter getConversationInfoPresenter() {
      return new ConversationInfoPresenter(
          provideThreadIdProvider.get(),
          DaggerAppComponent.this.getMessageRepository(),
          DaggerAppComponent.this.provideContextProvider.get(),
          DaggerAppComponent.this.getConversationRepository(),
          DaggerAppComponent.this.getDeleteConversations(),
          getMarkArchived(),
          getMarkUnarchived(),
          DaggerAppComponent.this.navigatorProvider.get(),
          DaggerAppComponent.this.getPermissionManager());
    }

    private ConversationInfoAdapter getConversationInfoAdapter() {
      return new ConversationInfoAdapter(
          DaggerAppComponent.this.provideContextProvider.get(),
          DaggerAppComponent.this.colorsProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ConversationInfoComponentBuilder builder) {
      this.provideThreadIdProvider =
          DoubleCheck.provider(
              ConversationInfoModule_ProvideThreadIdFactory.create(builder.conversationInfoModule));
    }

    @Override
    public void inject(ConversationInfoController controller) {
      injectConversationInfoController(controller);
    }

    private ConversationInfoController injectConversationInfoController(
        ConversationInfoController instance) {
      ConversationInfoController_MembersInjector.injectPresenter(
          instance, getConversationInfoPresenter());
      ConversationInfoController_MembersInjector.injectBlockingDialog(
          instance, DaggerAppComponent.this.getBlockingDialog());
      ConversationInfoController_MembersInjector.injectNavigator(
          instance, DaggerAppComponent.this.navigatorProvider.get());
      ConversationInfoController_MembersInjector.injectAdapter(
          instance, getConversationInfoAdapter());
      return instance;
    }
  }

  private final class ThemePickerComponentBuilder implements ThemePickerComponent.Builder {
    private ThemePickerModule themePickerModule;

    @Override
    public ThemePickerComponent build() {
      if (themePickerModule == null) {
        throw new IllegalStateException(
            ThemePickerModule.class.getCanonicalName() + " must be set");
      }
      return new ThemePickerComponentImpl(this);
    }

    @Override
    public ThemePickerComponentBuilder themePickerModule(ThemePickerModule module) {
      this.themePickerModule = Preconditions.checkNotNull(module);
      return this;
    }
  }

  private final class ThemePickerComponentImpl implements ThemePickerComponent {
    private Provider<Long> provideThreadIdProvider;

    private ThemePickerComponentImpl(ThemePickerComponentBuilder builder) {
      initialize(builder);
    }

    private ThemePickerPresenter getThemePickerPresenter() {
      return new ThemePickerPresenter(
          DaggerAppComponent.this.preferencesProvider.get(),
          provideThreadIdProvider.get(),
          DaggerAppComponent.this.getBillingManager(),
          DaggerAppComponent.this.colorsProvider.get(),
          DaggerAppComponent.this.navigatorProvider.get(),
          DaggerAppComponent.this.getWidgetManager());
    }

    private ThemeAdapter getThemeAdapter() {
      return new ThemeAdapter(
          DaggerAppComponent.this.provideContextProvider.get(),
          DaggerAppComponent.this.colorsProvider.get());
    }

    private ThemePagerAdapter getThemePagerAdapter() {
      return new ThemePagerAdapter(DaggerAppComponent.this.provideContextProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ThemePickerComponentBuilder builder) {
      this.provideThreadIdProvider =
          DoubleCheck.provider(
              ThemePickerModule_ProvideThreadIdFactory.create(builder.themePickerModule));
    }

    @Override
    public void inject(ThemePickerController controller) {
      injectThemePickerController(controller);
    }

    private ThemePickerController injectThemePickerController(ThemePickerController instance) {
      ThemePickerController_MembersInjector.injectPresenter(instance, getThemePickerPresenter());
      ThemePickerController_MembersInjector.injectColors(
          instance, DaggerAppComponent.this.colorsProvider.get());
      ThemePickerController_MembersInjector.injectThemeAdapter(instance, getThemeAdapter());
      ThemePickerController_MembersInjector.injectThemePagerAdapter(
          instance, getThemePagerAdapter());
      return instance;
    }
  }

  private final class MainActivitySubcomponentBuilder
      extends ActivityBuilderModule_BindMainActivity.MainActivitySubcomponent.Builder {
    private MainActivityModule mainActivityModule;

    private MainActivity seedInstance;

    @Override
    public ActivityBuilderModule_BindMainActivity.MainActivitySubcomponent build() {
      if (mainActivityModule == null) {
        this.mainActivityModule = new MainActivityModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(MainActivity.class.getCanonicalName() + " must be set");
      }
      return new MainActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(MainActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MainActivitySubcomponentImpl
      implements ActivityBuilderModule_BindMainActivity.MainActivitySubcomponent {
    private Provider<CompositeDisposable> provideCompositeDiposableLifecycleProvider;

    private MarkAllSeen_Factory markAllSeenProvider;

    private MigratePreferences_Factory migratePreferencesProvider;

    private MarkArchived_Factory markArchivedProvider;

    private MarkPinned_Factory markPinnedProvider;

    private MarkUnarchived_Factory markUnarchivedProvider;

    private MarkUnpinned_Factory markUnpinnedProvider;

    private MarkUnread_Factory markUnreadProvider;

    private SyncContacts_Factory syncContactsProvider;

    private MainViewModel_Factory mainViewModelProvider;

    private MainActivityModule_ProvideMainViewModelFactory provideMainViewModelProvider;

    private MainActivitySubcomponentImpl(MainActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private ConversationsAdapter getConversationsAdapter() {
      return new ConversationsAdapter(
          DaggerAppComponent.this.colorsProvider.get(),
          DaggerAppComponent.this.provideContextProvider.get(),
          DaggerAppComponent.this.dateFormatterProvider.get(),
          DaggerAppComponent.this.navigatorProvider.get(),
          DaggerAppComponent.this.phoneNumberUtilsProvider.get());
    }

    private DrawerBadgesExperiment getDrawerBadgesExperiment() {
      return new DrawerBadgesExperiment(
          DaggerAppComponent.this.provideContextProvider.get(),
          DaggerAppComponent.this.getAnalyticsManager());
    }

    private SearchAdapter getSearchAdapter() {
      return new SearchAdapter(
          DaggerAppComponent.this.colorsProvider.get(),
          DaggerAppComponent.this.provideContextProvider.get(),
          DaggerAppComponent.this.dateFormatterProvider.get(),
          DaggerAppComponent.this.navigatorProvider.get());
    }

    private ConversationItemTouchCallback getConversationItemTouchCallback() {
      return new ConversationItemTouchCallback(
          DaggerAppComponent.this.colorsProvider.get(),
          provideCompositeDiposableLifecycleProvider.get(),
          DaggerAppComponent.this.preferencesProvider.get(),
          DaggerAppComponent.this.provideContextProvider.get());
    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>>
        getMapOfClassOfAndProviderOfViewModel() {
      return Collections.<Class<? extends ViewModel>, Provider<ViewModel>>singletonMap(
          MainViewModel.class, provideMainViewModelProvider);
    }

    private ViewModelFactory getViewModelFactory() {
      return new ViewModelFactory(getMapOfClassOfAndProviderOfViewModel());
    }

    private ViewModelProvider.Factory getFactory() {
      return AppModule_ProvideViewModelFactoryFactory.proxyProvideViewModelFactory(
          DaggerAppComponent.this.appModule, getViewModelFactory());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final MainActivitySubcomponentBuilder builder) {
      this.provideCompositeDiposableLifecycleProvider =
          DoubleCheck.provider(
              MainActivityModule_ProvideCompositeDiposableLifecycleFactory.create(
                  builder.mainActivityModule));
      this.markAllSeenProvider =
          MarkAllSeen_Factory.create(DaggerAppComponent.this.provideMessageRepositoryProvider);
      this.migratePreferencesProvider =
          MigratePreferences_Factory.create(
              DaggerAppComponent.this.nightModeManagerProvider,
              DaggerAppComponent.this.preferencesProvider,
              DaggerAppComponent.this.provideRxPreferencesProvider);
      this.markArchivedProvider =
          MarkArchived_Factory.create(
              DaggerAppComponent.this.provideConversationRepositoryProvider,
              DaggerAppComponent.this.markReadProvider);
      this.markPinnedProvider =
          MarkPinned_Factory.create(
              DaggerAppComponent.this.provideConversationRepositoryProvider,
              DaggerAppComponent.this.updateBadgeProvider,
              DaggerAppComponent.this.provideShortcutManagerProvider);
      this.markUnarchivedProvider =
          MarkUnarchived_Factory.create(
              DaggerAppComponent.this.provideConversationRepositoryProvider);
      this.markUnpinnedProvider =
          MarkUnpinned_Factory.create(
              DaggerAppComponent.this.provideConversationRepositoryProvider,
              DaggerAppComponent.this.updateBadgeProvider,
              DaggerAppComponent.this.provideShortcutManagerProvider);
      this.markUnreadProvider =
          MarkUnread_Factory.create(
              DaggerAppComponent.this.provideMessageRepositoryProvider,
              DaggerAppComponent.this.updateBadgeProvider);
      this.syncContactsProvider =
          SyncContacts_Factory.create(DaggerAppComponent.this.provideSyncRepositoryProvider);
      this.mainViewModelProvider =
          MainViewModel_Factory.create(
              DaggerAppComponent.this.provideBillingManagerProvider,
              DaggerAppComponent.this.provideContactAddedListenerProvider,
              markAllSeenProvider,
              migratePreferencesProvider,
              DaggerAppComponent.this.provideSyncRepositoryProvider,
              DaggerAppComponent.this.changelogManagerProvider,
              DaggerAppComponent.this.provideConversationRepositoryProvider,
              DaggerAppComponent.this.deleteConversationsProvider,
              markArchivedProvider,
              markPinnedProvider,
              DaggerAppComponent.this.markReadProvider,
              markUnarchivedProvider,
              markUnpinnedProvider,
              markUnreadProvider,
              DaggerAppComponent.this.navigatorProvider,
              DaggerAppComponent.this.providePermissionsManagerProvider,
              DaggerAppComponent.this.preferencesProvider,
              DaggerAppComponent.this.provideRatingManagerProvider,
              syncContactsProvider,
              DaggerAppComponent.this.syncMessagesProvider);
      this.provideMainViewModelProvider =
          MainActivityModule_ProvideMainViewModelFactory.create(
              builder.mainActivityModule, mainViewModelProvider);
    }

    @Override
    public void inject(MainActivity arg0) {
      injectMainActivity(arg0);
    }

    private MainActivity injectMainActivity(MainActivity instance) {
      QkThemedActivity_MembersInjector.injectColors(
          instance, DaggerAppComponent.this.colorsProvider.get());
      QkThemedActivity_MembersInjector.injectConversationRepo(
          instance, DaggerAppComponent.this.getConversationRepository());
      QkThemedActivity_MembersInjector.injectMessageRepo(
          instance, DaggerAppComponent.this.getMessageRepository());
      QkThemedActivity_MembersInjector.injectPhoneNumberUtils(
          instance, DaggerAppComponent.this.phoneNumberUtilsProvider.get());
      QkThemedActivity_MembersInjector.injectPrefs(
          instance, DaggerAppComponent.this.preferencesProvider.get());
      MainActivity_MembersInjector.injectBlockingDialog(
          instance, DaggerAppComponent.this.getBlockingDialog());
      MainActivity_MembersInjector.injectDisposables(
          instance, provideCompositeDiposableLifecycleProvider.get());
      MainActivity_MembersInjector.injectNavigator(
          instance, DaggerAppComponent.this.navigatorProvider.get());
      MainActivity_MembersInjector.injectConversationsAdapter(instance, getConversationsAdapter());
      MainActivity_MembersInjector.injectDrawerBadgesExperiment(
          instance, getDrawerBadgesExperiment());
      MainActivity_MembersInjector.injectSearchAdapter(instance, getSearchAdapter());
      MainActivity_MembersInjector.injectItemTouchCallback(
          instance, getConversationItemTouchCallback());
      MainActivity_MembersInjector.injectViewModelFactory(instance, getFactory());
      return instance;
    }
  }

  private final class PlusActivitySubcomponentBuilder
      extends ActivityBuilderModule_BindPlusActivity.PlusActivitySubcomponent.Builder {
    private PlusActivityModule plusActivityModule;

    private PlusActivity seedInstance;

    @Override
    public ActivityBuilderModule_BindPlusActivity.PlusActivitySubcomponent build() {
      if (plusActivityModule == null) {
        this.plusActivityModule = new PlusActivityModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(PlusActivity.class.getCanonicalName() + " must be set");
      }
      return new PlusActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(PlusActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class PlusActivitySubcomponentImpl
      implements ActivityBuilderModule_BindPlusActivity.PlusActivitySubcomponent {
    private PlusViewModel_Factory plusViewModelProvider;

    private PlusActivityModule_ProvidePlusViewModelFactory providePlusViewModelProvider;

    private PlusActivitySubcomponentImpl(PlusActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private UpgradeButtonExperiment getUpgradeButtonExperiment() {
      return new UpgradeButtonExperiment(
          DaggerAppComponent.this.provideContextProvider.get(),
          DaggerAppComponent.this.getAnalyticsManager());
    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>>
        getMapOfClassOfAndProviderOfViewModel() {
      return Collections.<Class<? extends ViewModel>, Provider<ViewModel>>singletonMap(
          PlusViewModel.class, providePlusViewModelProvider);
    }

    private ViewModelFactory getViewModelFactory() {
      return new ViewModelFactory(getMapOfClassOfAndProviderOfViewModel());
    }

    private ViewModelProvider.Factory getFactory() {
      return AppModule_ProvideViewModelFactoryFactory.proxyProvideViewModelFactory(
          DaggerAppComponent.this.appModule, getViewModelFactory());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final PlusActivitySubcomponentBuilder builder) {
      this.plusViewModelProvider =
          PlusViewModel_Factory.create(
              DaggerAppComponent.this.provideAnalyticsManagerProvider,
              DaggerAppComponent.this.provideBillingManagerProvider,
              DaggerAppComponent.this.navigatorProvider);
      this.providePlusViewModelProvider =
          PlusActivityModule_ProvidePlusViewModelFactory.create(
              builder.plusActivityModule, plusViewModelProvider);
    }

    @Override
    public void inject(PlusActivity arg0) {
      injectPlusActivity(arg0);
    }

    private PlusActivity injectPlusActivity(PlusActivity instance) {
      QkThemedActivity_MembersInjector.injectColors(
          instance, DaggerAppComponent.this.colorsProvider.get());
      QkThemedActivity_MembersInjector.injectConversationRepo(
          instance, DaggerAppComponent.this.getConversationRepository());
      QkThemedActivity_MembersInjector.injectMessageRepo(
          instance, DaggerAppComponent.this.getMessageRepository());
      QkThemedActivity_MembersInjector.injectPhoneNumberUtils(
          instance, DaggerAppComponent.this.phoneNumberUtilsProvider.get());
      QkThemedActivity_MembersInjector.injectPrefs(
          instance, DaggerAppComponent.this.preferencesProvider.get());
      PlusActivity_MembersInjector.injectFontProvider(
          instance, DaggerAppComponent.this.fontProvider.get());
      PlusActivity_MembersInjector.injectUpgradeButtonExperiment(
          instance, getUpgradeButtonExperiment());
      PlusActivity_MembersInjector.injectViewModelFactory(instance, getFactory());
      return instance;
    }
  }

  private final class BackupActivitySubcomponentBuilder
      extends ActivityBuilderModule_BindBackupActivity.BackupActivitySubcomponent.Builder {
    private BackupActivity seedInstance;

    @Override
    public ActivityBuilderModule_BindBackupActivity.BackupActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(BackupActivity.class.getCanonicalName() + " must be set");
      }
      return new BackupActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(BackupActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class BackupActivitySubcomponentImpl
      implements ActivityBuilderModule_BindBackupActivity.BackupActivitySubcomponent {
    private BackupActivitySubcomponentImpl(BackupActivitySubcomponentBuilder builder) {}

    @Override
    public void inject(BackupActivity arg0) {
      injectBackupActivity(arg0);
    }

    private BackupActivity injectBackupActivity(BackupActivity instance) {
      QkThemedActivity_MembersInjector.injectColors(
          instance, DaggerAppComponent.this.colorsProvider.get());
      QkThemedActivity_MembersInjector.injectConversationRepo(
          instance, DaggerAppComponent.this.getConversationRepository());
      QkThemedActivity_MembersInjector.injectMessageRepo(
          instance, DaggerAppComponent.this.getMessageRepository());
      QkThemedActivity_MembersInjector.injectPhoneNumberUtils(
          instance, DaggerAppComponent.this.phoneNumberUtilsProvider.get());
      QkThemedActivity_MembersInjector.injectPrefs(
          instance, DaggerAppComponent.this.preferencesProvider.get());
      return instance;
    }
  }

  private final class ComposeActivitySubcomponentBuilder
      extends ActivityBuilderModule_BindComposeActivity.ComposeActivitySubcomponent.Builder {
    private ComposeActivityModule composeActivityModule;

    private ComposeActivity seedInstance;

    @Override
    public ActivityBuilderModule_BindComposeActivity.ComposeActivitySubcomponent build() {
      if (composeActivityModule == null) {
        this.composeActivityModule = new ComposeActivityModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(ComposeActivity.class.getCanonicalName() + " must be set");
      }
      return new ComposeActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(ComposeActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class ComposeActivitySubcomponentImpl
      implements ActivityBuilderModule_BindComposeActivity.ComposeActivitySubcomponent {
    private FileBinder_Factory fileBinderProvider;

    private MediaBinder_Factory mediaBinderProvider;

    private VCardBinder_Factory vCardBinderProvider;

    private PartsAdapter_Factory partsAdapterProvider;

    private Provider<ComposeActivity> seedInstanceProvider;

    private ComposeActivityModule_ProvideQueryFactory provideQueryProvider;

    private ComposeActivityModule_ProvideThreadIdFactory provideThreadIdProvider;

    private ComposeActivityModule_ProvideAddressesFactory provideAddressesProvider;

    private ComposeActivityModule_ProvideSharedTextFactory provideSharedTextProvider;

    private ComposeActivityModule_ProvideSharedAttachmentsFactory provideSharedAttachmentsProvider;

    private SendMessage_Factory sendMessageProvider;

    private SendScheduledMessage_Factory sendScheduledMessageProvider;

    private UpdateScheduledMessageAlarms_Factory updateScheduledMessageAlarmsProvider;

    private AddScheduledMessage_Factory addScheduledMessageProvider;

    private CancelDelayedMessage_Factory cancelDelayedMessageProvider;

    private DeleteMessages_Factory deleteMessagesProvider;

    private MessageDetailsFormatter_Factory messageDetailsFormatterProvider;

    private RetrySending_Factory retrySendingProvider;

    private SubscriptionManagerCompat_Factory subscriptionManagerCompatProvider;

    private ComposeViewModel_Factory composeViewModelProvider;

    private ComposeActivityModule_ProvideComposeViewModelFactory provideComposeViewModelProvider;

    private ComposeActivitySubcomponentImpl(ComposeActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private AttachmentAdapter getAttachmentAdapter() {
      return new AttachmentAdapter(DaggerAppComponent.this.provideContextProvider.get());
    }

    private SubscriptionManagerCompat getSubscriptionManagerCompat() {
      return new SubscriptionManagerCompat(
          DaggerAppComponent.this.provideContextProvider.get(),
          DaggerAppComponent.this.getPermissionManager());
    }

    private MessagesAdapter getMessagesAdapter() {
      return new MessagesAdapter(
          getSubscriptionManagerCompat(),
          DaggerAppComponent.this.provideContextProvider.get(),
          DaggerAppComponent.this.colorsProvider.get(),
          DaggerAppComponent.this.dateFormatterProvider.get(),
          partsAdapterProvider,
          DaggerAppComponent.this.phoneNumberUtilsProvider.get(),
          DaggerAppComponent.this.preferencesProvider.get(),
          DaggerAppComponent.this.getTextViewStyler());
    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>>
        getMapOfClassOfAndProviderOfViewModel() {
      return Collections.<Class<? extends ViewModel>, Provider<ViewModel>>singletonMap(
          ComposeViewModel.class, provideComposeViewModelProvider);
    }

    private ViewModelFactory getViewModelFactory() {
      return new ViewModelFactory(getMapOfClassOfAndProviderOfViewModel());
    }

    private ViewModelProvider.Factory getFactory() {
      return AppModule_ProvideViewModelFactoryFactory.proxyProvideViewModelFactory(
          DaggerAppComponent.this.appModule, getViewModelFactory());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ComposeActivitySubcomponentBuilder builder) {
      this.fileBinderProvider =
          FileBinder_Factory.create(
              DaggerAppComponent.this.colorsProvider,
              DaggerAppComponent.this.provideContextProvider);
      this.mediaBinderProvider =
          MediaBinder_Factory.create(
              DaggerAppComponent.this.colorsProvider,
              DaggerAppComponent.this.provideContextProvider);
      this.vCardBinderProvider =
          VCardBinder_Factory.create(
              DaggerAppComponent.this.colorsProvider,
              DaggerAppComponent.this.provideContextProvider);
      this.partsAdapterProvider =
          PartsAdapter_Factory.create(
              DaggerAppComponent.this.colorsProvider,
              fileBinderProvider,
              mediaBinderProvider,
              vCardBinderProvider);
      this.seedInstanceProvider = InstanceFactory.create(builder.seedInstance);
      this.provideQueryProvider =
          ComposeActivityModule_ProvideQueryFactory.create(
              builder.composeActivityModule, seedInstanceProvider);
      this.provideThreadIdProvider =
          ComposeActivityModule_ProvideThreadIdFactory.create(
              builder.composeActivityModule, seedInstanceProvider);
      this.provideAddressesProvider =
          ComposeActivityModule_ProvideAddressesFactory.create(
              builder.composeActivityModule, seedInstanceProvider);
      this.provideSharedTextProvider =
          ComposeActivityModule_ProvideSharedTextFactory.create(
              builder.composeActivityModule, seedInstanceProvider);
      this.provideSharedAttachmentsProvider =
          ComposeActivityModule_ProvideSharedAttachmentsFactory.create(
              builder.composeActivityModule, seedInstanceProvider);
      this.sendMessageProvider =
          SendMessage_Factory.create(
              DaggerAppComponent.this.provideContextProvider,
              DaggerAppComponent.this.provideConversationRepositoryProvider,
              DaggerAppComponent.this.provideMessageRepositoryProvider,
              DaggerAppComponent.this.updateBadgeProvider);
      this.sendScheduledMessageProvider =
          SendScheduledMessage_Factory.create(
              DaggerAppComponent.this.provideContextProvider,
              DaggerAppComponent.this.provideScheduledMessagesRepositoryProvider,
              sendMessageProvider);
      this.updateScheduledMessageAlarmsProvider =
          UpdateScheduledMessageAlarms_Factory.create(
              DaggerAppComponent.this.provideAlarmManagerProvider,
              DaggerAppComponent.this.provideScheduledMessagesRepositoryProvider,
              sendScheduledMessageProvider);
      this.addScheduledMessageProvider =
          AddScheduledMessage_Factory.create(
              DaggerAppComponent.this.provideScheduledMessagesRepositoryProvider,
              updateScheduledMessageAlarmsProvider);
      this.cancelDelayedMessageProvider =
          CancelDelayedMessage_Factory.create(
              DaggerAppComponent.this.provideConversationRepositoryProvider,
              DaggerAppComponent.this.provideMessageRepositoryProvider);
      this.deleteMessagesProvider =
          DeleteMessages_Factory.create(
              DaggerAppComponent.this.provideConversationRepositoryProvider,
              DaggerAppComponent.this.provideMessageRepositoryProvider,
              DaggerAppComponent.this.provideNotificationsManagerProvider,
              DaggerAppComponent.this.updateBadgeProvider);
      this.messageDetailsFormatterProvider =
          MessageDetailsFormatter_Factory.create(
              DaggerAppComponent.this.provideContextProvider,
              DaggerAppComponent.this.dateFormatterProvider);
      this.retrySendingProvider =
          RetrySending_Factory.create(DaggerAppComponent.this.provideMessageRepositoryProvider);
      this.subscriptionManagerCompatProvider =
          SubscriptionManagerCompat_Factory.create(
              DaggerAppComponent.this.provideContextProvider,
              DaggerAppComponent.this.providePermissionsManagerProvider);
      this.composeViewModelProvider =
          ComposeViewModel_Factory.create(
              provideQueryProvider,
              provideThreadIdProvider,
              provideAddressesProvider,
              provideSharedTextProvider,
              provideSharedAttachmentsProvider,
              DaggerAppComponent.this.provideContactRepositoryProvider,
              DaggerAppComponent.this.provideContextProvider,
              DaggerAppComponent.this.provideActiveConversationManagerProvider,
              addScheduledMessageProvider,
              DaggerAppComponent.this.provideBillingManagerProvider,
              cancelDelayedMessageProvider,
              DaggerAppComponent.this.provideConversationRepositoryProvider,
              deleteMessagesProvider,
              DaggerAppComponent.this.markReadProvider,
              messageDetailsFormatterProvider,
              DaggerAppComponent.this.provideMessageRepositoryProvider,
              DaggerAppComponent.this.navigatorProvider,
              DaggerAppComponent.this.providePermissionsManagerProvider,
              DaggerAppComponent.this.phoneNumberUtilsProvider,
              DaggerAppComponent.this.preferencesProvider,
              retrySendingProvider,
              sendMessageProvider,
              subscriptionManagerCompatProvider);
      this.provideComposeViewModelProvider =
          ComposeActivityModule_ProvideComposeViewModelFactory.create(
              builder.composeActivityModule, composeViewModelProvider);
    }

    @Override
    public void inject(ComposeActivity arg0) {
      injectComposeActivity(arg0);
    }

    private ComposeActivity injectComposeActivity(ComposeActivity instance) {
      QkThemedActivity_MembersInjector.injectColors(
          instance, DaggerAppComponent.this.colorsProvider.get());
      QkThemedActivity_MembersInjector.injectConversationRepo(
          instance, DaggerAppComponent.this.getConversationRepository());
      QkThemedActivity_MembersInjector.injectMessageRepo(
          instance, DaggerAppComponent.this.getMessageRepository());
      QkThemedActivity_MembersInjector.injectPhoneNumberUtils(
          instance, DaggerAppComponent.this.phoneNumberUtilsProvider.get());
      QkThemedActivity_MembersInjector.injectPrefs(
          instance, DaggerAppComponent.this.preferencesProvider.get());
      ComposeActivity_MembersInjector.injectAttachmentAdapter(instance, getAttachmentAdapter());
      ComposeActivity_MembersInjector.injectChipsAdapter(instance, new ChipsAdapter());
      ComposeActivity_MembersInjector.injectDateFormatter(
          instance, DaggerAppComponent.this.dateFormatterProvider.get());
      ComposeActivity_MembersInjector.injectMessageAdapter(instance, getMessagesAdapter());
      ComposeActivity_MembersInjector.injectNavigator(
          instance, DaggerAppComponent.this.navigatorProvider.get());
      ComposeActivity_MembersInjector.injectViewModelFactory(instance, getFactory());
      return instance;
    }
  }

  private final class ContactsActivitySubcomponentBuilder
      extends ActivityBuilderModule_BindContactsActivity.ContactsActivitySubcomponent.Builder {
    private ContactsActivityModule contactsActivityModule;

    private ContactsActivity seedInstance;

    @Override
    public ActivityBuilderModule_BindContactsActivity.ContactsActivitySubcomponent build() {
      if (contactsActivityModule == null) {
        this.contactsActivityModule = new ContactsActivityModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(ContactsActivity.class.getCanonicalName() + " must be set");
      }
      return new ContactsActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(ContactsActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class ContactsActivitySubcomponentImpl
      implements ActivityBuilderModule_BindContactsActivity.ContactsActivitySubcomponent {
    private Provider<ContactsActivity> seedInstanceProvider;

    private ContactsActivityModule_ProvideIsSharingFactory provideIsSharingProvider;

    private ContactsActivityModule_ProvideChipsFactory provideChipsProvider;

    private ContactGroupFilter_Factory contactGroupFilterProvider;

    private SetDefaultPhoneNumber_Factory setDefaultPhoneNumberProvider;

    private ContactsViewModel_Factory contactsViewModelProvider;

    private ContactsActivityModule_ProvideContactsViewModelFactory provideContactsViewModelProvider;

    private ContactsActivitySubcomponentImpl(ContactsActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private ComposeItemAdapter getComposeItemAdapter() {
      return new ComposeItemAdapter(
          DaggerAppComponent.this.colorsProvider.get(),
          DaggerAppComponent.this.getConversationRepository());
    }

    private PhoneNumberPickerAdapter getPhoneNumberPickerAdapter() {
      return new PhoneNumberPickerAdapter(DaggerAppComponent.this.provideContextProvider.get());
    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>>
        getMapOfClassOfAndProviderOfViewModel() {
      return Collections.<Class<? extends ViewModel>, Provider<ViewModel>>singletonMap(
          ContactsViewModel.class, provideContactsViewModelProvider);
    }

    private ViewModelFactory getViewModelFactory() {
      return new ViewModelFactory(getMapOfClassOfAndProviderOfViewModel());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ContactsActivitySubcomponentBuilder builder) {
      this.seedInstanceProvider = InstanceFactory.create(builder.seedInstance);
      this.provideIsSharingProvider =
          ContactsActivityModule_ProvideIsSharingFactory.create(
              builder.contactsActivityModule, seedInstanceProvider);
      this.provideChipsProvider =
          ContactsActivityModule_ProvideChipsFactory.create(
              builder.contactsActivityModule, seedInstanceProvider);
      this.contactGroupFilterProvider =
          ContactGroupFilter_Factory.create(DaggerAppComponent.this.contactFilterProvider);
      this.setDefaultPhoneNumberProvider =
          SetDefaultPhoneNumber_Factory.create(
              DaggerAppComponent.this.provideContactRepositoryProvider);
      this.contactsViewModelProvider =
          ContactsViewModel_Factory.create(
              provideIsSharingProvider,
              provideChipsProvider,
              DaggerAppComponent.this.contactFilterProvider,
              contactGroupFilterProvider,
              DaggerAppComponent.this.provideContactRepositoryProvider,
              DaggerAppComponent.this.provideConversationRepositoryProvider,
              DaggerAppComponent.this.phoneNumberUtilsProvider,
              setDefaultPhoneNumberProvider);
      this.provideContactsViewModelProvider =
          ContactsActivityModule_ProvideContactsViewModelFactory.create(
              builder.contactsActivityModule, contactsViewModelProvider);
    }

    @Override
    public void inject(ContactsActivity arg0) {
      injectContactsActivity(arg0);
    }

    private ContactsActivity injectContactsActivity(ContactsActivity instance) {
      QkThemedActivity_MembersInjector.injectColors(
          instance, DaggerAppComponent.this.colorsProvider.get());
      QkThemedActivity_MembersInjector.injectConversationRepo(
          instance, DaggerAppComponent.this.getConversationRepository());
      QkThemedActivity_MembersInjector.injectMessageRepo(
          instance, DaggerAppComponent.this.getMessageRepository());
      QkThemedActivity_MembersInjector.injectPhoneNumberUtils(
          instance, DaggerAppComponent.this.phoneNumberUtilsProvider.get());
      QkThemedActivity_MembersInjector.injectPrefs(
          instance, DaggerAppComponent.this.preferencesProvider.get());
      ContactsActivity_MembersInjector.injectContactsAdapter(instance, getComposeItemAdapter());
      ContactsActivity_MembersInjector.injectPhoneNumberAdapter(
          instance, getPhoneNumberPickerAdapter());
      ContactsActivity_MembersInjector.injectViewModelFactory(instance, getViewModelFactory());
      return instance;
    }
  }

  private final class ConversationInfoActivitySubcomponentBuilder
      extends ActivityBuilderModule_BindConversationInfoActivity
          .ConversationInfoActivitySubcomponent.Builder {
    private ConversationInfoActivity seedInstance;

    @Override
    public ActivityBuilderModule_BindConversationInfoActivity.ConversationInfoActivitySubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            ConversationInfoActivity.class.getCanonicalName() + " must be set");
      }
      return new ConversationInfoActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(ConversationInfoActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class ConversationInfoActivitySubcomponentImpl
      implements ActivityBuilderModule_BindConversationInfoActivity
          .ConversationInfoActivitySubcomponent {
    private ConversationInfoActivitySubcomponentImpl(
        ConversationInfoActivitySubcomponentBuilder builder) {}

    @Override
    public void inject(ConversationInfoActivity arg0) {
      injectConversationInfoActivity(arg0);
    }

    private ConversationInfoActivity injectConversationInfoActivity(
        ConversationInfoActivity instance) {
      QkThemedActivity_MembersInjector.injectColors(
          instance, DaggerAppComponent.this.colorsProvider.get());
      QkThemedActivity_MembersInjector.injectConversationRepo(
          instance, DaggerAppComponent.this.getConversationRepository());
      QkThemedActivity_MembersInjector.injectMessageRepo(
          instance, DaggerAppComponent.this.getMessageRepository());
      QkThemedActivity_MembersInjector.injectPhoneNumberUtils(
          instance, DaggerAppComponent.this.phoneNumberUtilsProvider.get());
      QkThemedActivity_MembersInjector.injectPrefs(
          instance, DaggerAppComponent.this.preferencesProvider.get());
      return instance;
    }
  }

  private final class GalleryActivitySubcomponentBuilder
      extends ActivityBuilderModule_BindGalleryActivity.GalleryActivitySubcomponent.Builder {
    private GalleryActivityModule galleryActivityModule;

    private GalleryActivity seedInstance;

    @Override
    public ActivityBuilderModule_BindGalleryActivity.GalleryActivitySubcomponent build() {
      if (galleryActivityModule == null) {
        this.galleryActivityModule = new GalleryActivityModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(GalleryActivity.class.getCanonicalName() + " must be set");
      }
      return new GalleryActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(GalleryActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class GalleryActivitySubcomponentImpl
      implements ActivityBuilderModule_BindGalleryActivity.GalleryActivitySubcomponent {
    private Provider<GalleryActivity> seedInstanceProvider;

    private GalleryActivityModule_ProvidePartIdFactory providePartIdProvider;

    private SaveImage_Factory saveImageProvider;

    private GalleryViewModel_Factory galleryViewModelProvider;

    private GalleryActivityModule_ProvideGalleryViewModelFactory provideGalleryViewModelProvider;

    private GalleryActivitySubcomponentImpl(GalleryActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>>
        getMapOfClassOfAndProviderOfViewModel() {
      return Collections.<Class<? extends ViewModel>, Provider<ViewModel>>singletonMap(
          GalleryViewModel.class, provideGalleryViewModelProvider);
    }

    private ViewModelFactory getViewModelFactory() {
      return new ViewModelFactory(getMapOfClassOfAndProviderOfViewModel());
    }

    private ViewModelProvider.Factory getFactory() {
      return AppModule_ProvideViewModelFactoryFactory.proxyProvideViewModelFactory(
          DaggerAppComponent.this.appModule, getViewModelFactory());
    }

    private GalleryPagerAdapter getGalleryPagerAdapter() {
      return new GalleryPagerAdapter(DaggerAppComponent.this.provideContextProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final GalleryActivitySubcomponentBuilder builder) {
      this.seedInstanceProvider = InstanceFactory.create(builder.seedInstance);
      this.providePartIdProvider =
          GalleryActivityModule_ProvidePartIdFactory.create(
              builder.galleryActivityModule, seedInstanceProvider);
      this.saveImageProvider =
          SaveImage_Factory.create(DaggerAppComponent.this.provideMessageRepositoryProvider);
      this.galleryViewModelProvider =
          GalleryViewModel_Factory.create(
              DaggerAppComponent.this.provideConversationRepositoryProvider,
              providePartIdProvider,
              DaggerAppComponent.this.provideContextProvider,
              DaggerAppComponent.this.provideMessageRepositoryProvider,
              DaggerAppComponent.this.navigatorProvider,
              saveImageProvider,
              DaggerAppComponent.this.providePermissionsManagerProvider);
      this.provideGalleryViewModelProvider =
          GalleryActivityModule_ProvideGalleryViewModelFactory.create(
              builder.galleryActivityModule, galleryViewModelProvider);
    }

    @Override
    public void inject(GalleryActivity arg0) {
      injectGalleryActivity(arg0);
    }

    private GalleryActivity injectGalleryActivity(GalleryActivity instance) {
      GalleryActivity_MembersInjector.injectDateFormatter(
          instance, DaggerAppComponent.this.dateFormatterProvider.get());
      GalleryActivity_MembersInjector.injectViewModelFactory(instance, getFactory());
      GalleryActivity_MembersInjector.injectPagerAdapter(instance, getGalleryPagerAdapter());
      return instance;
    }
  }

  private final class NotificationPrefsActivitySubcomponentBuilder
      extends ActivityBuilderModule_BindNotificationPrefsActivity
          .NotificationPrefsActivitySubcomponent.Builder {
    private NotificationPrefsActivityModule notificationPrefsActivityModule;

    private NotificationPrefsActivity seedInstance;

    @Override
    public ActivityBuilderModule_BindNotificationPrefsActivity.NotificationPrefsActivitySubcomponent
        build() {
      if (notificationPrefsActivityModule == null) {
        this.notificationPrefsActivityModule = new NotificationPrefsActivityModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(
            NotificationPrefsActivity.class.getCanonicalName() + " must be set");
      }
      return new NotificationPrefsActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(NotificationPrefsActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class NotificationPrefsActivitySubcomponentImpl
      implements ActivityBuilderModule_BindNotificationPrefsActivity
          .NotificationPrefsActivitySubcomponent {
    private Provider<NotificationPrefsActivity> seedInstanceProvider;

    private NotificationPrefsActivityModule_ProvideThreadIdFactory provideThreadIdProvider;

    private NotificationPrefsViewModel_Factory notificationPrefsViewModelProvider;

    private NotificationPrefsActivityModule_ProvideNotificationPrefsViewModelFactory
        provideNotificationPrefsViewModelProvider;

    private NotificationPrefsActivitySubcomponentImpl(
        NotificationPrefsActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>>
        getMapOfClassOfAndProviderOfViewModel() {
      return Collections.<Class<? extends ViewModel>, Provider<ViewModel>>singletonMap(
          NotificationPrefsViewModel.class, provideNotificationPrefsViewModelProvider);
    }

    private ViewModelFactory getViewModelFactory() {
      return new ViewModelFactory(getMapOfClassOfAndProviderOfViewModel());
    }

    private ViewModelProvider.Factory getFactory() {
      return AppModule_ProvideViewModelFactoryFactory.proxyProvideViewModelFactory(
          DaggerAppComponent.this.appModule, getViewModelFactory());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final NotificationPrefsActivitySubcomponentBuilder builder) {
      this.seedInstanceProvider = InstanceFactory.create(builder.seedInstance);
      this.provideThreadIdProvider =
          NotificationPrefsActivityModule_ProvideThreadIdFactory.create(
              builder.notificationPrefsActivityModule, seedInstanceProvider);
      this.notificationPrefsViewModelProvider =
          NotificationPrefsViewModel_Factory.create(
              provideThreadIdProvider,
              DaggerAppComponent.this.provideContextProvider,
              DaggerAppComponent.this.provideConversationRepositoryProvider,
              DaggerAppComponent.this.navigatorProvider,
              DaggerAppComponent.this.preferencesProvider);
      this.provideNotificationPrefsViewModelProvider =
          NotificationPrefsActivityModule_ProvideNotificationPrefsViewModelFactory.create(
              builder.notificationPrefsActivityModule, notificationPrefsViewModelProvider);
    }

    @Override
    public void inject(NotificationPrefsActivity arg0) {
      injectNotificationPrefsActivity(arg0);
    }

    private NotificationPrefsActivity injectNotificationPrefsActivity(
        NotificationPrefsActivity instance) {
      QkThemedActivity_MembersInjector.injectColors(
          instance, DaggerAppComponent.this.colorsProvider.get());
      QkThemedActivity_MembersInjector.injectConversationRepo(
          instance, DaggerAppComponent.this.getConversationRepository());
      QkThemedActivity_MembersInjector.injectMessageRepo(
          instance, DaggerAppComponent.this.getMessageRepository());
      QkThemedActivity_MembersInjector.injectPhoneNumberUtils(
          instance, DaggerAppComponent.this.phoneNumberUtilsProvider.get());
      QkThemedActivity_MembersInjector.injectPrefs(
          instance, DaggerAppComponent.this.preferencesProvider.get());
      NotificationPrefsActivity_MembersInjector.injectPreviewModeDialog(
          instance, DaggerAppComponent.this.getQkDialog());
      NotificationPrefsActivity_MembersInjector.injectActionsDialog(
          instance, DaggerAppComponent.this.getQkDialog());
      NotificationPrefsActivity_MembersInjector.injectViewModelFactory(instance, getFactory());
      return instance;
    }
  }

  private final class QkReplyActivitySubcomponentBuilder
      extends ActivityBuilderModule_BindQkReplyActivity.QkReplyActivitySubcomponent.Builder {
    private QkReplyActivityModule qkReplyActivityModule;

    private QkReplyActivity seedInstance;

    @Override
    public ActivityBuilderModule_BindQkReplyActivity.QkReplyActivitySubcomponent build() {
      if (qkReplyActivityModule == null) {
        this.qkReplyActivityModule = new QkReplyActivityModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(QkReplyActivity.class.getCanonicalName() + " must be set");
      }
      return new QkReplyActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(QkReplyActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class QkReplyActivitySubcomponentImpl
      implements ActivityBuilderModule_BindQkReplyActivity.QkReplyActivitySubcomponent {
    private FileBinder_Factory fileBinderProvider;

    private MediaBinder_Factory mediaBinderProvider;

    private VCardBinder_Factory vCardBinderProvider;

    private PartsAdapter_Factory partsAdapterProvider;

    private Provider<QkReplyActivity> seedInstanceProvider;

    private QkReplyActivityModule_ProvideThreadIdFactory provideThreadIdProvider;

    private DeleteMessages_Factory deleteMessagesProvider;

    private SendMessage_Factory sendMessageProvider;

    private SubscriptionManagerCompat_Factory subscriptionManagerCompatProvider;

    private QkReplyViewModel_Factory qkReplyViewModelProvider;

    private QkReplyActivityModule_ProvideQkReplyViewModelFactory provideQkReplyViewModelProvider;

    private QkReplyActivitySubcomponentImpl(QkReplyActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private SubscriptionManagerCompat getSubscriptionManagerCompat() {
      return new SubscriptionManagerCompat(
          DaggerAppComponent.this.provideContextProvider.get(),
          DaggerAppComponent.this.getPermissionManager());
    }

    private MessagesAdapter getMessagesAdapter() {
      return new MessagesAdapter(
          getSubscriptionManagerCompat(),
          DaggerAppComponent.this.provideContextProvider.get(),
          DaggerAppComponent.this.colorsProvider.get(),
          DaggerAppComponent.this.dateFormatterProvider.get(),
          partsAdapterProvider,
          DaggerAppComponent.this.phoneNumberUtilsProvider.get(),
          DaggerAppComponent.this.preferencesProvider.get(),
          DaggerAppComponent.this.getTextViewStyler());
    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>>
        getMapOfClassOfAndProviderOfViewModel() {
      return Collections.<Class<? extends ViewModel>, Provider<ViewModel>>singletonMap(
          QkReplyViewModel.class, provideQkReplyViewModelProvider);
    }

    private ViewModelFactory getViewModelFactory() {
      return new ViewModelFactory(getMapOfClassOfAndProviderOfViewModel());
    }

    private ViewModelProvider.Factory getFactory() {
      return AppModule_ProvideViewModelFactoryFactory.proxyProvideViewModelFactory(
          DaggerAppComponent.this.appModule, getViewModelFactory());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final QkReplyActivitySubcomponentBuilder builder) {
      this.fileBinderProvider =
          FileBinder_Factory.create(
              DaggerAppComponent.this.colorsProvider,
              DaggerAppComponent.this.provideContextProvider);
      this.mediaBinderProvider =
          MediaBinder_Factory.create(
              DaggerAppComponent.this.colorsProvider,
              DaggerAppComponent.this.provideContextProvider);
      this.vCardBinderProvider =
          VCardBinder_Factory.create(
              DaggerAppComponent.this.colorsProvider,
              DaggerAppComponent.this.provideContextProvider);
      this.partsAdapterProvider =
          PartsAdapter_Factory.create(
              DaggerAppComponent.this.colorsProvider,
              fileBinderProvider,
              mediaBinderProvider,
              vCardBinderProvider);
      this.seedInstanceProvider = InstanceFactory.create(builder.seedInstance);
      this.provideThreadIdProvider =
          QkReplyActivityModule_ProvideThreadIdFactory.create(
              builder.qkReplyActivityModule, seedInstanceProvider);
      this.deleteMessagesProvider =
          DeleteMessages_Factory.create(
              DaggerAppComponent.this.provideConversationRepositoryProvider,
              DaggerAppComponent.this.provideMessageRepositoryProvider,
              DaggerAppComponent.this.provideNotificationsManagerProvider,
              DaggerAppComponent.this.updateBadgeProvider);
      this.sendMessageProvider =
          SendMessage_Factory.create(
              DaggerAppComponent.this.provideContextProvider,
              DaggerAppComponent.this.provideConversationRepositoryProvider,
              DaggerAppComponent.this.provideMessageRepositoryProvider,
              DaggerAppComponent.this.updateBadgeProvider);
      this.subscriptionManagerCompatProvider =
          SubscriptionManagerCompat_Factory.create(
              DaggerAppComponent.this.provideContextProvider,
              DaggerAppComponent.this.providePermissionsManagerProvider);
      this.qkReplyViewModelProvider =
          QkReplyViewModel_Factory.create(
              provideThreadIdProvider,
              DaggerAppComponent.this.provideConversationRepositoryProvider,
              deleteMessagesProvider,
              DaggerAppComponent.this.markReadProvider,
              DaggerAppComponent.this.provideMessageRepositoryProvider,
              DaggerAppComponent.this.navigatorProvider,
              sendMessageProvider,
              subscriptionManagerCompatProvider);
      this.provideQkReplyViewModelProvider =
          QkReplyActivityModule_ProvideQkReplyViewModelFactory.create(
              builder.qkReplyActivityModule, qkReplyViewModelProvider);
    }

    @Override
    public void inject(QkReplyActivity arg0) {
      injectQkReplyActivity(arg0);
    }

    private QkReplyActivity injectQkReplyActivity(QkReplyActivity instance) {
      QkThemedActivity_MembersInjector.injectColors(
          instance, DaggerAppComponent.this.colorsProvider.get());
      QkThemedActivity_MembersInjector.injectConversationRepo(
          instance, DaggerAppComponent.this.getConversationRepository());
      QkThemedActivity_MembersInjector.injectMessageRepo(
          instance, DaggerAppComponent.this.getMessageRepository());
      QkThemedActivity_MembersInjector.injectPhoneNumberUtils(
          instance, DaggerAppComponent.this.phoneNumberUtilsProvider.get());
      QkThemedActivity_MembersInjector.injectPrefs(
          instance, DaggerAppComponent.this.preferencesProvider.get());
      QkReplyActivity_MembersInjector.injectAdapter(instance, getMessagesAdapter());
      QkReplyActivity_MembersInjector.injectViewModelFactory(instance, getFactory());
      return instance;
    }
  }

  private final class ScheduledActivitySubcomponentBuilder
      extends ActivityBuilderModule_BindScheduledActivity.ScheduledActivitySubcomponent.Builder {
    private ScheduledActivityModule scheduledActivityModule;

    private ScheduledActivity seedInstance;

    @Override
    public ActivityBuilderModule_BindScheduledActivity.ScheduledActivitySubcomponent build() {
      if (scheduledActivityModule == null) {
        this.scheduledActivityModule = new ScheduledActivityModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(
            ScheduledActivity.class.getCanonicalName() + " must be set");
      }
      return new ScheduledActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(ScheduledActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class ScheduledActivitySubcomponentImpl
      implements ActivityBuilderModule_BindScheduledActivity.ScheduledActivitySubcomponent {
    private SendMessage_Factory sendMessageProvider;

    private SendScheduledMessage_Factory sendScheduledMessageProvider;

    private ScheduledViewModel_Factory scheduledViewModelProvider;

    private ScheduledActivityModule_ProvideScheduledViewModelFactory
        provideScheduledViewModelProvider;

    private ScheduledActivitySubcomponentImpl(ScheduledActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private ScheduledMessageAdapter getScheduledMessageAdapter() {
      return new ScheduledMessageAdapter(
          DaggerAppComponent.this.provideContextProvider.get(),
          DaggerAppComponent.this.getContactRepository(),
          DaggerAppComponent.this.dateFormatterProvider.get(),
          DaggerAppComponent.this.phoneNumberUtilsProvider.get());
    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>>
        getMapOfClassOfAndProviderOfViewModel() {
      return Collections.<Class<? extends ViewModel>, Provider<ViewModel>>singletonMap(
          ScheduledViewModel.class, provideScheduledViewModelProvider);
    }

    private ViewModelFactory getViewModelFactory() {
      return new ViewModelFactory(getMapOfClassOfAndProviderOfViewModel());
    }

    private ViewModelProvider.Factory getFactory() {
      return AppModule_ProvideViewModelFactoryFactory.proxyProvideViewModelFactory(
          DaggerAppComponent.this.appModule, getViewModelFactory());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ScheduledActivitySubcomponentBuilder builder) {
      this.sendMessageProvider =
          SendMessage_Factory.create(
              DaggerAppComponent.this.provideContextProvider,
              DaggerAppComponent.this.provideConversationRepositoryProvider,
              DaggerAppComponent.this.provideMessageRepositoryProvider,
              DaggerAppComponent.this.updateBadgeProvider);
      this.sendScheduledMessageProvider =
          SendScheduledMessage_Factory.create(
              DaggerAppComponent.this.provideContextProvider,
              DaggerAppComponent.this.provideScheduledMessagesRepositoryProvider,
              sendMessageProvider);
      this.scheduledViewModelProvider =
          ScheduledViewModel_Factory.create(
              DaggerAppComponent.this.provideBillingManagerProvider,
              DaggerAppComponent.this.provideContextProvider,
              DaggerAppComponent.this.navigatorProvider,
              DaggerAppComponent.this.provideScheduledMessagesRepositoryProvider,
              sendScheduledMessageProvider);
      this.provideScheduledViewModelProvider =
          ScheduledActivityModule_ProvideScheduledViewModelFactory.create(
              builder.scheduledActivityModule, scheduledViewModelProvider);
    }

    @Override
    public void inject(ScheduledActivity arg0) {
      injectScheduledActivity(arg0);
    }

    private ScheduledActivity injectScheduledActivity(ScheduledActivity instance) {
      QkThemedActivity_MembersInjector.injectColors(
          instance, DaggerAppComponent.this.colorsProvider.get());
      QkThemedActivity_MembersInjector.injectConversationRepo(
          instance, DaggerAppComponent.this.getConversationRepository());
      QkThemedActivity_MembersInjector.injectMessageRepo(
          instance, DaggerAppComponent.this.getMessageRepository());
      QkThemedActivity_MembersInjector.injectPhoneNumberUtils(
          instance, DaggerAppComponent.this.phoneNumberUtilsProvider.get());
      QkThemedActivity_MembersInjector.injectPrefs(
          instance, DaggerAppComponent.this.preferencesProvider.get());
      ScheduledActivity_MembersInjector.injectDialog(
          instance, DaggerAppComponent.this.getQkDialog());
      ScheduledActivity_MembersInjector.injectFontProvider(
          instance, DaggerAppComponent.this.fontProvider.get());
      ScheduledActivity_MembersInjector.injectMessageAdapter(
          instance, getScheduledMessageAdapter());
      ScheduledActivity_MembersInjector.injectViewModelFactory(instance, getFactory());
      return instance;
    }
  }

  private final class SettingsActivitySubcomponentBuilder
      extends ActivityBuilderModule_BindSettingsActivity.SettingsActivitySubcomponent.Builder {
    private SettingsActivity seedInstance;

    @Override
    public ActivityBuilderModule_BindSettingsActivity.SettingsActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(SettingsActivity.class.getCanonicalName() + " must be set");
      }
      return new SettingsActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(SettingsActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class SettingsActivitySubcomponentImpl
      implements ActivityBuilderModule_BindSettingsActivity.SettingsActivitySubcomponent {
    private SettingsActivitySubcomponentImpl(SettingsActivitySubcomponentBuilder builder) {}

    @Override
    public void inject(SettingsActivity arg0) {
      injectSettingsActivity(arg0);
    }

    private SettingsActivity injectSettingsActivity(SettingsActivity instance) {
      QkThemedActivity_MembersInjector.injectColors(
          instance, DaggerAppComponent.this.colorsProvider.get());
      QkThemedActivity_MembersInjector.injectConversationRepo(
          instance, DaggerAppComponent.this.getConversationRepository());
      QkThemedActivity_MembersInjector.injectMessageRepo(
          instance, DaggerAppComponent.this.getMessageRepository());
      QkThemedActivity_MembersInjector.injectPhoneNumberUtils(
          instance, DaggerAppComponent.this.phoneNumberUtilsProvider.get());
      QkThemedActivity_MembersInjector.injectPrefs(
          instance, DaggerAppComponent.this.preferencesProvider.get());
      return instance;
    }
  }

  private final class BlockingActivitySubcomponentBuilder
      extends ActivityBuilderModule_BindBlockingActivity.BlockingActivitySubcomponent.Builder {
    private BlockingActivity seedInstance;

    @Override
    public ActivityBuilderModule_BindBlockingActivity.BlockingActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(BlockingActivity.class.getCanonicalName() + " must be set");
      }
      return new BlockingActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(BlockingActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class BlockingActivitySubcomponentImpl
      implements ActivityBuilderModule_BindBlockingActivity.BlockingActivitySubcomponent {
    private BlockingActivitySubcomponentImpl(BlockingActivitySubcomponentBuilder builder) {}

    @Override
    public void inject(BlockingActivity arg0) {
      injectBlockingActivity(arg0);
    }

    private BlockingActivity injectBlockingActivity(BlockingActivity instance) {
      QkThemedActivity_MembersInjector.injectColors(
          instance, DaggerAppComponent.this.colorsProvider.get());
      QkThemedActivity_MembersInjector.injectConversationRepo(
          instance, DaggerAppComponent.this.getConversationRepository());
      QkThemedActivity_MembersInjector.injectMessageRepo(
          instance, DaggerAppComponent.this.getMessageRepository());
      QkThemedActivity_MembersInjector.injectPhoneNumberUtils(
          instance, DaggerAppComponent.this.phoneNumberUtilsProvider.get());
      QkThemedActivity_MembersInjector.injectPrefs(
          instance, DaggerAppComponent.this.preferencesProvider.get());
      return instance;
    }
  }

  private final class BlockThreadReceiverSubcomponentBuilder
      extends BroadcastReceiverBuilderModule_BindBlockThreadReceiver.BlockThreadReceiverSubcomponent
          .Builder {
    private BlockThreadReceiver seedInstance;

    @Override
    public BroadcastReceiverBuilderModule_BindBlockThreadReceiver.BlockThreadReceiverSubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            BlockThreadReceiver.class.getCanonicalName() + " must be set");
      }
      return new BlockThreadReceiverSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(BlockThreadReceiver arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class BlockThreadReceiverSubcomponentImpl
      implements BroadcastReceiverBuilderModule_BindBlockThreadReceiver
          .BlockThreadReceiverSubcomponent {
    private BlockThreadReceiverSubcomponentImpl(BlockThreadReceiverSubcomponentBuilder builder) {}

    @Override
    public void inject(BlockThreadReceiver arg0) {
      injectBlockThreadReceiver(arg0);
    }

    private BlockThreadReceiver injectBlockThreadReceiver(BlockThreadReceiver instance) {
      BlockThreadReceiver_MembersInjector.injectBlockingClient(
          instance, DaggerAppComponent.this.getBlockingClient());
      BlockThreadReceiver_MembersInjector.injectConversationRepo(
          instance, DaggerAppComponent.this.getConversationRepository());
      BlockThreadReceiver_MembersInjector.injectMarkBlocked(
          instance, DaggerAppComponent.this.getMarkBlocked());
      BlockThreadReceiver_MembersInjector.injectPrefs(
          instance, DaggerAppComponent.this.preferencesProvider.get());
      return instance;
    }
  }

  private final class BootReceiverSubcomponentBuilder
      extends BroadcastReceiverBuilderModule_BindBootReceiver.BootReceiverSubcomponent.Builder {
    private BootReceiver seedInstance;

    @Override
    public BroadcastReceiverBuilderModule_BindBootReceiver.BootReceiverSubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(BootReceiver.class.getCanonicalName() + " must be set");
      }
      return new BootReceiverSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(BootReceiver arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class BootReceiverSubcomponentImpl
      implements BroadcastReceiverBuilderModule_BindBootReceiver.BootReceiverSubcomponent {
    private BootReceiverSubcomponentImpl(BootReceiverSubcomponentBuilder builder) {}

    private SendMessage getSendMessage() {
      return new SendMessage(
          DaggerAppComponent.this.provideContextProvider.get(),
          DaggerAppComponent.this.getConversationRepository(),
          DaggerAppComponent.this.getMessageRepository(),
          DaggerAppComponent.this.getUpdateBadge());
    }

    private SendScheduledMessage getSendScheduledMessage() {
      return new SendScheduledMessage(
          DaggerAppComponent.this.provideContextProvider.get(),
          DaggerAppComponent.this.getScheduledMessageRepository(),
          getSendMessage());
    }

    private UpdateScheduledMessageAlarms getUpdateScheduledMessageAlarms() {
      return new UpdateScheduledMessageAlarms(
          DaggerAppComponent.this.getAlarmManager(),
          DaggerAppComponent.this.getScheduledMessageRepository(),
          getSendScheduledMessage());
    }

    @Override
    public void inject(BootReceiver arg0) {
      injectBootReceiver(arg0);
    }

    private BootReceiver injectBootReceiver(BootReceiver instance) {
      BootReceiver_MembersInjector.injectUpdateScheduledMessageAlarms(
          instance, getUpdateScheduledMessageAlarms());
      return instance;
    }
  }

  private final class DefaultSmsChangedReceiverSubcomponentBuilder
      extends BroadcastReceiverBuilderModule_BindDefaultSmsChangedReceiver
          .DefaultSmsChangedReceiverSubcomponent.Builder {
    private DefaultSmsChangedReceiver seedInstance;

    @Override
    public BroadcastReceiverBuilderModule_BindDefaultSmsChangedReceiver
            .DefaultSmsChangedReceiverSubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            DefaultSmsChangedReceiver.class.getCanonicalName() + " must be set");
      }
      return new DefaultSmsChangedReceiverSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(DefaultSmsChangedReceiver arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class DefaultSmsChangedReceiverSubcomponentImpl
      implements BroadcastReceiverBuilderModule_BindDefaultSmsChangedReceiver
          .DefaultSmsChangedReceiverSubcomponent {
    private DefaultSmsChangedReceiverSubcomponentImpl(
        DefaultSmsChangedReceiverSubcomponentBuilder builder) {}

    @Override
    public void inject(DefaultSmsChangedReceiver arg0) {
      injectDefaultSmsChangedReceiver(arg0);
    }

    private DefaultSmsChangedReceiver injectDefaultSmsChangedReceiver(
        DefaultSmsChangedReceiver instance) {
      DefaultSmsChangedReceiver_MembersInjector.injectPrefs(
          instance, DaggerAppComponent.this.preferencesProvider.get());
      DefaultSmsChangedReceiver_MembersInjector.injectSyncMessages(
          instance, DaggerAppComponent.this.getSyncMessages());
      return instance;
    }
  }

  private final class DeleteMessagesReceiverSubcomponentBuilder
      extends BroadcastReceiverBuilderModule_BindDeleteMessagesReceiver
          .DeleteMessagesReceiverSubcomponent.Builder {
    private DeleteMessagesReceiver seedInstance;

    @Override
    public BroadcastReceiverBuilderModule_BindDeleteMessagesReceiver
            .DeleteMessagesReceiverSubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            DeleteMessagesReceiver.class.getCanonicalName() + " must be set");
      }
      return new DeleteMessagesReceiverSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(DeleteMessagesReceiver arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class DeleteMessagesReceiverSubcomponentImpl
      implements BroadcastReceiverBuilderModule_BindDeleteMessagesReceiver
          .DeleteMessagesReceiverSubcomponent {
    private DeleteMessagesReceiverSubcomponentImpl(
        DeleteMessagesReceiverSubcomponentBuilder builder) {}

    private DeleteMessages getDeleteMessages() {
      return new DeleteMessages(
          DaggerAppComponent.this.getConversationRepository(),
          DaggerAppComponent.this.getMessageRepository(),
          DaggerAppComponent.this.getNotificationManager(),
          DaggerAppComponent.this.getUpdateBadge());
    }

    @Override
    public void inject(DeleteMessagesReceiver arg0) {
      injectDeleteMessagesReceiver(arg0);
    }

    private DeleteMessagesReceiver injectDeleteMessagesReceiver(DeleteMessagesReceiver instance) {
      DeleteMessagesReceiver_MembersInjector.injectDeleteMessages(instance, getDeleteMessages());
      return instance;
    }
  }

  private final class MarkArchivedReceiverSubcomponentBuilder
      extends BroadcastReceiverBuilderModule_BindMarkArchivedReceiver
          .MarkArchivedReceiverSubcomponent.Builder {
    private MarkArchivedReceiver seedInstance;

    @Override
    public BroadcastReceiverBuilderModule_BindMarkArchivedReceiver.MarkArchivedReceiverSubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            MarkArchivedReceiver.class.getCanonicalName() + " must be set");
      }
      return new MarkArchivedReceiverSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(MarkArchivedReceiver arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MarkArchivedReceiverSubcomponentImpl
      implements BroadcastReceiverBuilderModule_BindMarkArchivedReceiver
          .MarkArchivedReceiverSubcomponent {
    private MarkArchivedReceiverSubcomponentImpl(MarkArchivedReceiverSubcomponentBuilder builder) {}

    private MarkArchived getMarkArchived() {
      return new MarkArchived(
          DaggerAppComponent.this.getConversationRepository(),
          DaggerAppComponent.this.getMarkRead());
    }

    @Override
    public void inject(MarkArchivedReceiver arg0) {
      injectMarkArchivedReceiver(arg0);
    }

    private MarkArchivedReceiver injectMarkArchivedReceiver(MarkArchivedReceiver instance) {
      MarkArchivedReceiver_MembersInjector.injectMarkArchived(instance, getMarkArchived());
      return instance;
    }
  }

  private final class MarkReadReceiverSubcomponentBuilder
      extends BroadcastReceiverBuilderModule_BindMarkReadReceiver.MarkReadReceiverSubcomponent
          .Builder {
    private MarkReadReceiver seedInstance;

    @Override
    public BroadcastReceiverBuilderModule_BindMarkReadReceiver.MarkReadReceiverSubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(MarkReadReceiver.class.getCanonicalName() + " must be set");
      }
      return new MarkReadReceiverSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(MarkReadReceiver arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MarkReadReceiverSubcomponentImpl
      implements BroadcastReceiverBuilderModule_BindMarkReadReceiver.MarkReadReceiverSubcomponent {
    private MarkReadReceiverSubcomponentImpl(MarkReadReceiverSubcomponentBuilder builder) {}

    @Override
    public void inject(MarkReadReceiver arg0) {
      injectMarkReadReceiver(arg0);
    }

    private MarkReadReceiver injectMarkReadReceiver(MarkReadReceiver instance) {
      MarkReadReceiver_MembersInjector.injectMarkRead(
          instance, DaggerAppComponent.this.getMarkRead());
      return instance;
    }
  }

  private final class MarkSeenReceiverSubcomponentBuilder
      extends BroadcastReceiverBuilderModule_BindMarkSeenReceiver.MarkSeenReceiverSubcomponent
          .Builder {
    private MarkSeenReceiver seedInstance;

    @Override
    public BroadcastReceiverBuilderModule_BindMarkSeenReceiver.MarkSeenReceiverSubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(MarkSeenReceiver.class.getCanonicalName() + " must be set");
      }
      return new MarkSeenReceiverSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(MarkSeenReceiver arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MarkSeenReceiverSubcomponentImpl
      implements BroadcastReceiverBuilderModule_BindMarkSeenReceiver.MarkSeenReceiverSubcomponent {
    private MarkSeenReceiverSubcomponentImpl(MarkSeenReceiverSubcomponentBuilder builder) {}

    private MarkSeen getMarkSeen() {
      return new MarkSeen(DaggerAppComponent.this.getMessageRepository());
    }

    @Override
    public void inject(MarkSeenReceiver arg0) {
      injectMarkSeenReceiver(arg0);
    }

    private MarkSeenReceiver injectMarkSeenReceiver(MarkSeenReceiver instance) {
      MarkSeenReceiver_MembersInjector.injectMarkSeen(instance, getMarkSeen());
      return instance;
    }
  }

  private final class MmsReceivedReceiverSubcomponentBuilder
      extends BroadcastReceiverBuilderModule_BindMmsReceivedReceiver.MmsReceivedReceiverSubcomponent
          .Builder {
    private MmsReceivedReceiver seedInstance;

    @Override
    public BroadcastReceiverBuilderModule_BindMmsReceivedReceiver.MmsReceivedReceiverSubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            MmsReceivedReceiver.class.getCanonicalName() + " must be set");
      }
      return new MmsReceivedReceiverSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(MmsReceivedReceiver arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MmsReceivedReceiverSubcomponentImpl
      implements BroadcastReceiverBuilderModule_BindMmsReceivedReceiver
          .MmsReceivedReceiverSubcomponent {
    private MmsReceivedReceiverSubcomponentImpl(MmsReceivedReceiverSubcomponentBuilder builder) {}

    private ReceiveMms getReceiveMms() {
      return new ReceiveMms(
          DaggerAppComponent.this.getActiveConversationManager(),
          DaggerAppComponent.this.getConversationRepository(),
          DaggerAppComponent.this.getBlockingClient(),
          DaggerAppComponent.this.preferencesProvider.get(),
          DaggerAppComponent.this.getSyncRepository(),
          DaggerAppComponent.this.getMessageRepository(),
          DaggerAppComponent.this.getNotificationManager(),
          DaggerAppComponent.this.getUpdateBadge());
    }

    @Override
    public void inject(MmsReceivedReceiver arg0) {
      injectMmsReceivedReceiver(arg0);
    }

    private MmsReceivedReceiver injectMmsReceivedReceiver(MmsReceivedReceiver instance) {
      MmsReceivedReceiver_MembersInjector.injectReceiveMms(instance, getReceiveMms());
      return instance;
    }
  }

  private final class MmsReceiverSubcomponentBuilder
      extends BroadcastReceiverBuilderModule_BindMmsReceiver.MmsReceiverSubcomponent.Builder {
    private MmsReceiver seedInstance;

    @Override
    public BroadcastReceiverBuilderModule_BindMmsReceiver.MmsReceiverSubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(MmsReceiver.class.getCanonicalName() + " must be set");
      }
      return new MmsReceiverSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(MmsReceiver arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MmsReceiverSubcomponentImpl
      implements BroadcastReceiverBuilderModule_BindMmsReceiver.MmsReceiverSubcomponent {
    private MmsReceiverSubcomponentImpl(MmsReceiverSubcomponentBuilder builder) {}

    @Override
    public void inject(MmsReceiver arg0) {}
  }

  private final class MmsSentReceiverSubcomponentBuilder
      extends BroadcastReceiverBuilderModule_BindMmsSentReceiver.MmsSentReceiverSubcomponent
          .Builder {
    private MmsSentReceiver seedInstance;

    @Override
    public BroadcastReceiverBuilderModule_BindMmsSentReceiver.MmsSentReceiverSubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(MmsSentReceiver.class.getCanonicalName() + " must be set");
      }
      return new MmsSentReceiverSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(MmsSentReceiver arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MmsSentReceiverSubcomponentImpl
      implements BroadcastReceiverBuilderModule_BindMmsSentReceiver.MmsSentReceiverSubcomponent {
    private MmsSentReceiverSubcomponentImpl(MmsSentReceiverSubcomponentBuilder builder) {}

    private SyncMessage getSyncMessage() {
      return new SyncMessage(
          DaggerAppComponent.this.getConversationRepository(),
          DaggerAppComponent.this.getSyncRepository(),
          DaggerAppComponent.this.getUpdateBadge());
    }

    @Override
    public void inject(MmsSentReceiver arg0) {
      injectMmsSentReceiver(arg0);
    }

    private MmsSentReceiver injectMmsSentReceiver(MmsSentReceiver instance) {
      MmsSentReceiver_MembersInjector.injectSyncMessage(instance, getSyncMessage());
      return instance;
    }
  }

  private final class MmsUpdatedReceiverSubcomponentBuilder
      extends BroadcastReceiverBuilderModule_BindMmsUpdatedReceiver.MmsUpdatedReceiverSubcomponent
          .Builder {
    private MmsUpdatedReceiver seedInstance;

    @Override
    public BroadcastReceiverBuilderModule_BindMmsUpdatedReceiver.MmsUpdatedReceiverSubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            MmsUpdatedReceiver.class.getCanonicalName() + " must be set");
      }
      return new MmsUpdatedReceiverSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(MmsUpdatedReceiver arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MmsUpdatedReceiverSubcomponentImpl
      implements BroadcastReceiverBuilderModule_BindMmsUpdatedReceiver
          .MmsUpdatedReceiverSubcomponent {
    private MmsUpdatedReceiverSubcomponentImpl(MmsUpdatedReceiverSubcomponentBuilder builder) {}

    private SyncMessage getSyncMessage() {
      return new SyncMessage(
          DaggerAppComponent.this.getConversationRepository(),
          DaggerAppComponent.this.getSyncRepository(),
          DaggerAppComponent.this.getUpdateBadge());
    }

    @Override
    public void inject(MmsUpdatedReceiver arg0) {
      injectMmsUpdatedReceiver(arg0);
    }

    private MmsUpdatedReceiver injectMmsUpdatedReceiver(MmsUpdatedReceiver instance) {
      MmsUpdatedReceiver_MembersInjector.injectSyncMessage(instance, getSyncMessage());
      return instance;
    }
  }

  private final class NightModeReceiverSubcomponentBuilder
      extends BroadcastReceiverBuilderModule_BindNightModeReceiver.NightModeReceiverSubcomponent
          .Builder {
    private NightModeReceiver seedInstance;

    @Override
    public BroadcastReceiverBuilderModule_BindNightModeReceiver.NightModeReceiverSubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            NightModeReceiver.class.getCanonicalName() + " must be set");
      }
      return new NightModeReceiverSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(NightModeReceiver arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class NightModeReceiverSubcomponentImpl
      implements BroadcastReceiverBuilderModule_BindNightModeReceiver
          .NightModeReceiverSubcomponent {
    private NightModeReceiverSubcomponentImpl(NightModeReceiverSubcomponentBuilder builder) {}

    @Override
    public void inject(NightModeReceiver arg0) {
      injectNightModeReceiver(arg0);
    }

    private NightModeReceiver injectNightModeReceiver(NightModeReceiver instance) {
      NightModeReceiver_MembersInjector.injectNightModeManager(
          instance, DaggerAppComponent.this.nightModeManagerProvider.get());
      return instance;
    }
  }

  private final class RemoteMessagingReceiverSubcomponentBuilder
      extends BroadcastReceiverBuilderModule_BindRemoteMessagingReceiver
          .RemoteMessagingReceiverSubcomponent.Builder {
    private RemoteMessagingReceiver seedInstance;

    @Override
    public BroadcastReceiverBuilderModule_BindRemoteMessagingReceiver
            .RemoteMessagingReceiverSubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            RemoteMessagingReceiver.class.getCanonicalName() + " must be set");
      }
      return new RemoteMessagingReceiverSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(RemoteMessagingReceiver arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class RemoteMessagingReceiverSubcomponentImpl
      implements BroadcastReceiverBuilderModule_BindRemoteMessagingReceiver
          .RemoteMessagingReceiverSubcomponent {
    private RemoteMessagingReceiverSubcomponentImpl(
        RemoteMessagingReceiverSubcomponentBuilder builder) {}

    private SendMessage getSendMessage() {
      return new SendMessage(
          DaggerAppComponent.this.provideContextProvider.get(),
          DaggerAppComponent.this.getConversationRepository(),
          DaggerAppComponent.this.getMessageRepository(),
          DaggerAppComponent.this.getUpdateBadge());
    }

    private SubscriptionManagerCompat getSubscriptionManagerCompat() {
      return new SubscriptionManagerCompat(
          DaggerAppComponent.this.provideContextProvider.get(),
          DaggerAppComponent.this.getPermissionManager());
    }

    @Override
    public void inject(RemoteMessagingReceiver arg0) {
      injectRemoteMessagingReceiver(arg0);
    }

    private RemoteMessagingReceiver injectRemoteMessagingReceiver(
        RemoteMessagingReceiver instance) {
      RemoteMessagingReceiver_MembersInjector.injectConversationRepo(
          instance, DaggerAppComponent.this.getConversationRepository());
      RemoteMessagingReceiver_MembersInjector.injectMarkRead(
          instance, DaggerAppComponent.this.getMarkRead());
      RemoteMessagingReceiver_MembersInjector.injectMessageRepo(
          instance, DaggerAppComponent.this.getMessageRepository());
      RemoteMessagingReceiver_MembersInjector.injectSendMessage(instance, getSendMessage());
      RemoteMessagingReceiver_MembersInjector.injectSubscriptionManager(
          instance, getSubscriptionManagerCompat());
      return instance;
    }
  }

  private final class SendScheduledMessageReceiverSubcomponentBuilder
      extends BroadcastReceiverBuilderModule_BindSendScheduledMessageReceiver
          .SendScheduledMessageReceiverSubcomponent.Builder {
    private SendScheduledMessageReceiver seedInstance;

    @Override
    public BroadcastReceiverBuilderModule_BindSendScheduledMessageReceiver
            .SendScheduledMessageReceiverSubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            SendScheduledMessageReceiver.class.getCanonicalName() + " must be set");
      }
      return new SendScheduledMessageReceiverSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(SendScheduledMessageReceiver arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class SendScheduledMessageReceiverSubcomponentImpl
      implements BroadcastReceiverBuilderModule_BindSendScheduledMessageReceiver
          .SendScheduledMessageReceiverSubcomponent {
    private SendScheduledMessageReceiverSubcomponentImpl(
        SendScheduledMessageReceiverSubcomponentBuilder builder) {}

    private SendMessage getSendMessage() {
      return new SendMessage(
          DaggerAppComponent.this.provideContextProvider.get(),
          DaggerAppComponent.this.getConversationRepository(),
          DaggerAppComponent.this.getMessageRepository(),
          DaggerAppComponent.this.getUpdateBadge());
    }

    private SendScheduledMessage getSendScheduledMessage() {
      return new SendScheduledMessage(
          DaggerAppComponent.this.provideContextProvider.get(),
          DaggerAppComponent.this.getScheduledMessageRepository(),
          getSendMessage());
    }

    @Override
    public void inject(SendScheduledMessageReceiver arg0) {
      injectSendScheduledMessageReceiver(arg0);
    }

    private SendScheduledMessageReceiver injectSendScheduledMessageReceiver(
        SendScheduledMessageReceiver instance) {
      SendScheduledMessageReceiver_MembersInjector.injectMessageRepo(
          instance, DaggerAppComponent.this.getMessageRepository());
      SendScheduledMessageReceiver_MembersInjector.injectSendScheduledMessage(
          instance, getSendScheduledMessage());
      return instance;
    }
  }

  private final class SmsDeliveredReceiverSubcomponentBuilder
      extends BroadcastReceiverBuilderModule_BindSmsDeliveredReceiver
          .SmsDeliveredReceiverSubcomponent.Builder {
    private SmsDeliveredReceiver seedInstance;

    @Override
    public BroadcastReceiverBuilderModule_BindSmsDeliveredReceiver.SmsDeliveredReceiverSubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            SmsDeliveredReceiver.class.getCanonicalName() + " must be set");
      }
      return new SmsDeliveredReceiverSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(SmsDeliveredReceiver arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class SmsDeliveredReceiverSubcomponentImpl
      implements BroadcastReceiverBuilderModule_BindSmsDeliveredReceiver
          .SmsDeliveredReceiverSubcomponent {
    private SmsDeliveredReceiverSubcomponentImpl(SmsDeliveredReceiverSubcomponentBuilder builder) {}

    private MarkDelivered getMarkDelivered() {
      return new MarkDelivered(DaggerAppComponent.this.getMessageRepository());
    }

    private MarkDeliveryFailed getMarkDeliveryFailed() {
      return new MarkDeliveryFailed(DaggerAppComponent.this.getMessageRepository());
    }

    @Override
    public void inject(SmsDeliveredReceiver arg0) {
      injectSmsDeliveredReceiver(arg0);
    }

    private SmsDeliveredReceiver injectSmsDeliveredReceiver(SmsDeliveredReceiver instance) {
      SmsDeliveredReceiver_MembersInjector.injectMarkDelivered(instance, getMarkDelivered());
      SmsDeliveredReceiver_MembersInjector.injectMarkDeliveryFailed(
          instance, getMarkDeliveryFailed());
      return instance;
    }
  }

  private final class SmsProviderChangedReceiverSubcomponentBuilder
      extends BroadcastReceiverBuilderModule_BindSmsProviderChangedReceiver
          .SmsProviderChangedReceiverSubcomponent.Builder {
    private SmsProviderChangedReceiver seedInstance;

    @Override
    public BroadcastReceiverBuilderModule_BindSmsProviderChangedReceiver
            .SmsProviderChangedReceiverSubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            SmsProviderChangedReceiver.class.getCanonicalName() + " must be set");
      }
      return new SmsProviderChangedReceiverSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(SmsProviderChangedReceiver arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class SmsProviderChangedReceiverSubcomponentImpl
      implements BroadcastReceiverBuilderModule_BindSmsProviderChangedReceiver
          .SmsProviderChangedReceiverSubcomponent {
    private SmsProviderChangedReceiverSubcomponentImpl(
        SmsProviderChangedReceiverSubcomponentBuilder builder) {}

    private SyncMessage getSyncMessage() {
      return new SyncMessage(
          DaggerAppComponent.this.getConversationRepository(),
          DaggerAppComponent.this.getSyncRepository(),
          DaggerAppComponent.this.getUpdateBadge());
    }

    @Override
    public void inject(SmsProviderChangedReceiver arg0) {
      injectSmsProviderChangedReceiver(arg0);
    }

    private SmsProviderChangedReceiver injectSmsProviderChangedReceiver(
        SmsProviderChangedReceiver instance) {
      SmsProviderChangedReceiver_MembersInjector.injectSyncMessage(instance, getSyncMessage());
      return instance;
    }
  }

  private final class SmsReceiverSubcomponentBuilder
      extends BroadcastReceiverBuilderModule_BindSmsReceiver.SmsReceiverSubcomponent.Builder {
    private SmsReceiver seedInstance;

    @Override
    public BroadcastReceiverBuilderModule_BindSmsReceiver.SmsReceiverSubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(SmsReceiver.class.getCanonicalName() + " must be set");
      }
      return new SmsReceiverSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(SmsReceiver arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class SmsReceiverSubcomponentImpl
      implements BroadcastReceiverBuilderModule_BindSmsReceiver.SmsReceiverSubcomponent {
    private SmsReceiverSubcomponentImpl(SmsReceiverSubcomponentBuilder builder) {}

    private ReceiveSms getReceiveSms() {
      return new ReceiveSms(
          DaggerAppComponent.this.getConversationRepository(),
          DaggerAppComponent.this.getBlockingClient(),
          DaggerAppComponent.this.preferencesProvider.get(),
          DaggerAppComponent.this.getMessageRepository(),
          DaggerAppComponent.this.getNotificationManager(),
          DaggerAppComponent.this.getUpdateBadge(),
          DaggerAppComponent.this.getShortcutManager());
    }

    @Override
    public void inject(SmsReceiver arg0) {
      injectSmsReceiver(arg0);
    }

    private SmsReceiver injectSmsReceiver(SmsReceiver instance) {
      SmsReceiver_MembersInjector.injectReceiveMessage(instance, getReceiveSms());
      return instance;
    }
  }

  private final class SmsSentReceiverSubcomponentBuilder
      extends BroadcastReceiverBuilderModule_BindSmsSentReceiver.SmsSentReceiverSubcomponent
          .Builder {
    private SmsSentReceiver seedInstance;

    @Override
    public BroadcastReceiverBuilderModule_BindSmsSentReceiver.SmsSentReceiverSubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(SmsSentReceiver.class.getCanonicalName() + " must be set");
      }
      return new SmsSentReceiverSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(SmsSentReceiver arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class SmsSentReceiverSubcomponentImpl
      implements BroadcastReceiverBuilderModule_BindSmsSentReceiver.SmsSentReceiverSubcomponent {
    private SmsSentReceiverSubcomponentImpl(SmsSentReceiverSubcomponentBuilder builder) {}

    private MarkSent getMarkSent() {
      return new MarkSent(DaggerAppComponent.this.getMessageRepository());
    }

    private MarkFailed getMarkFailed() {
      return new MarkFailed(
          DaggerAppComponent.this.getMessageRepository(),
          DaggerAppComponent.this.getNotificationManager());
    }

    @Override
    public void inject(SmsSentReceiver arg0) {
      injectSmsSentReceiver(arg0);
    }

    private SmsSentReceiver injectSmsSentReceiver(SmsSentReceiver instance) {
      SmsSentReceiver_MembersInjector.injectMarkSent(instance, getMarkSent());
      SmsSentReceiver_MembersInjector.injectMarkFailed(instance, getMarkFailed());
      return instance;
    }
  }

  private final class WidgetProviderSubcomponentBuilder
      extends BroadcastReceiverBuilderModule_BindWidgetProvider.WidgetProviderSubcomponent.Builder {
    private WidgetProvider seedInstance;

    @Override
    public BroadcastReceiverBuilderModule_BindWidgetProvider.WidgetProviderSubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(WidgetProvider.class.getCanonicalName() + " must be set");
      }
      return new WidgetProviderSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(WidgetProvider arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class WidgetProviderSubcomponentImpl
      implements BroadcastReceiverBuilderModule_BindWidgetProvider.WidgetProviderSubcomponent {
    private WidgetProviderSubcomponentImpl(WidgetProviderSubcomponentBuilder builder) {}

    @Override
    public void inject(WidgetProvider arg0) {
      injectWidgetProvider(arg0);
    }

    private WidgetProvider injectWidgetProvider(WidgetProvider instance) {
      WidgetProvider_MembersInjector.injectColors(
          instance, DaggerAppComponent.this.colorsProvider.get());
      WidgetProvider_MembersInjector.injectPrefs(
          instance, DaggerAppComponent.this.preferencesProvider.get());
      return instance;
    }
  }

  private final class SendSmsReceiverSubcomponentBuilder
      extends ServiceBuilderModule_BindSendSmsReceiver.SendSmsReceiverSubcomponent.Builder {
    private SendSmsReceiver seedInstance;

    @Override
    public ServiceBuilderModule_BindSendSmsReceiver.SendSmsReceiverSubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(SendSmsReceiver.class.getCanonicalName() + " must be set");
      }
      return new SendSmsReceiverSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(SendSmsReceiver arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class SendSmsReceiverSubcomponentImpl
      implements ServiceBuilderModule_BindSendSmsReceiver.SendSmsReceiverSubcomponent {
    private SendSmsReceiverSubcomponentImpl(SendSmsReceiverSubcomponentBuilder builder) {}

    private RetrySending getRetrySending() {
      return new RetrySending(DaggerAppComponent.this.getMessageRepository());
    }

    @Override
    public void inject(SendSmsReceiver arg0) {
      injectSendSmsReceiver(arg0);
    }

    private SendSmsReceiver injectSendSmsReceiver(SendSmsReceiver instance) {
      SendSmsReceiver_MembersInjector.injectMessageRepo(
          instance, DaggerAppComponent.this.getMessageRepository());
      SendSmsReceiver_MembersInjector.injectRetrySending(instance, getRetrySending());
      return instance;
    }
  }

  private final class AutoDeleteServiceSubcomponentBuilder
      extends ServiceBuilderModule_BindAutoDeleteService.AutoDeleteServiceSubcomponent.Builder {
    private AutoDeleteService seedInstance;

    @Override
    public ServiceBuilderModule_BindAutoDeleteService.AutoDeleteServiceSubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            AutoDeleteService.class.getCanonicalName() + " must be set");
      }
      return new AutoDeleteServiceSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(AutoDeleteService arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class AutoDeleteServiceSubcomponentImpl
      implements ServiceBuilderModule_BindAutoDeleteService.AutoDeleteServiceSubcomponent {
    private AutoDeleteServiceSubcomponentImpl(AutoDeleteServiceSubcomponentBuilder builder) {}

    @Override
    public void inject(AutoDeleteService arg0) {
      injectAutoDeleteService(arg0);
    }

    private AutoDeleteService injectAutoDeleteService(AutoDeleteService instance) {
      AutoDeleteService_MembersInjector.injectDeleteOldMessages(
          instance, DaggerAppComponent.this.getDeleteOldMessages());
      return instance;
    }
  }

  private final class HeadlessSmsSendServiceSubcomponentBuilder
      extends ServiceBuilderModule_BindHeadlessSmsSendService.HeadlessSmsSendServiceSubcomponent
          .Builder {
    private HeadlessSmsSendService seedInstance;

    @Override
    public ServiceBuilderModule_BindHeadlessSmsSendService.HeadlessSmsSendServiceSubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            HeadlessSmsSendService.class.getCanonicalName() + " must be set");
      }
      return new HeadlessSmsSendServiceSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(HeadlessSmsSendService arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class HeadlessSmsSendServiceSubcomponentImpl
      implements ServiceBuilderModule_BindHeadlessSmsSendService
          .HeadlessSmsSendServiceSubcomponent {
    private HeadlessSmsSendServiceSubcomponentImpl(
        HeadlessSmsSendServiceSubcomponentBuilder builder) {}

    private SendMessage getSendMessage() {
      return new SendMessage(
          DaggerAppComponent.this.provideContextProvider.get(),
          DaggerAppComponent.this.getConversationRepository(),
          DaggerAppComponent.this.getMessageRepository(),
          DaggerAppComponent.this.getUpdateBadge());
    }

    @Override
    public void inject(HeadlessSmsSendService arg0) {
      injectHeadlessSmsSendService(arg0);
    }

    private HeadlessSmsSendService injectHeadlessSmsSendService(HeadlessSmsSendService instance) {
      HeadlessSmsSendService_MembersInjector.injectConversationRepo(
          instance, DaggerAppComponent.this.getConversationRepository());
      HeadlessSmsSendService_MembersInjector.injectSendMessage(instance, getSendMessage());
      return instance;
    }
  }

  private final class RestoreBackupServiceSubcomponentBuilder
      extends ServiceBuilderModule_BindRestoreBackupService.RestoreBackupServiceSubcomponent
          .Builder {
    private RestoreBackupService seedInstance;

    @Override
    public ServiceBuilderModule_BindRestoreBackupService.RestoreBackupServiceSubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            RestoreBackupService.class.getCanonicalName() + " must be set");
      }
      return new RestoreBackupServiceSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(RestoreBackupService arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class RestoreBackupServiceSubcomponentImpl
      implements ServiceBuilderModule_BindRestoreBackupService.RestoreBackupServiceSubcomponent {
    private RestoreBackupServiceSubcomponentImpl(RestoreBackupServiceSubcomponentBuilder builder) {}

    @Override
    public void inject(RestoreBackupService arg0) {
      injectRestoreBackupService(arg0);
    }

    private RestoreBackupService injectRestoreBackupService(RestoreBackupService instance) {
      RestoreBackupService_MembersInjector.injectBackupRepo(
          instance, DaggerAppComponent.this.getBackupRepository());
      RestoreBackupService_MembersInjector.injectNotificationManager(
          instance, DaggerAppComponent.this.getNotificationManager());
      return instance;
    }
  }
}
