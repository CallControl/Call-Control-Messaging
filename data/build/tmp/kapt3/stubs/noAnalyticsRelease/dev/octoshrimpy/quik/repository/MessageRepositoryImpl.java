package dev.octoshrimpy.quik.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0014\u0010\u0013\u001a\u00020\u00102\n\u0010\u0006\u001a\u00020\u0014\"\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u0012H\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"H\u0016J\u001c\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00170$2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\'\u001a\b\u0012\u0004\u0012\u00020&0\u001b2\u0006\u0010\u001d\u001a\u00020\u0012H\u0016J\b\u0010(\u001a\u00020\u0012H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u0012H\u0016J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u0012H\u0016J(\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\u0012H\u0016J0\u00100\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\"2\u0006\u00101\u001a\u00020\u0012H\u0016J\b\u00102\u001a\u00020\u0010H\u0016J\u0010\u00103\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u00104\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u0017H\u0016J\u0018\u00106\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u0017H\u0016J\u0014\u00107\u001a\u00020\u00102\n\u00108\u001a\u00020\u0014\"\u00020\u0012H\u0016J\u0010\u00109\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0012H\u0016J\u0010\u0010:\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010;\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0014\u0010<\u001a\u00020\u00102\n\u00108\u001a\u00020\u0014\"\u00020\u0012H\u0016J\u0010\u0010=\u001a\u00020\u00102\u0006\u0010>\u001a\u00020\u001cH\u0016J\u0012\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016JD\u0010A\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00122\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\"0C2\u0006\u0010.\u001a\u00020\"2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020E0C2\u0006\u0010F\u001a\u00020\u0017H\u0016J\u0010\u0010G\u001a\u00020\u00102\u0006\u0010>\u001a\u00020\u001cH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006H"}, d2 = {"Ldev/octoshrimpy/quik/repository/MessageRepositoryImpl;", "Ldev/octoshrimpy/quik/repository/MessageRepository;", "activeConversationManager", "Ldev/octoshrimpy/quik/manager/ActiveConversationManager;", "context", "Landroid/content/Context;", "messageIds", "Ldev/octoshrimpy/quik/manager/KeyManager;", "phoneNumberUtils", "Ldev/octoshrimpy/quik/util/PhoneNumberUtils;", "prefs", "Ldev/octoshrimpy/quik/util/Preferences;", "syncRepository", "Ldev/octoshrimpy/quik/repository/SyncRepository;", "(Ldev/octoshrimpy/quik/manager/ActiveConversationManager;Landroid/content/Context;Ldev/octoshrimpy/quik/manager/KeyManager;Ldev/octoshrimpy/quik/util/PhoneNumberUtils;Ldev/octoshrimpy/quik/util/Preferences;Ldev/octoshrimpy/quik/repository/SyncRepository;)V", "cancelDelayedSms", "", "id", "", "deleteMessages", "", "deleteOldMessages", "maxAgeDays", "", "getIntentForDelayedSms", "Landroid/app/PendingIntent;", "getLastIncomingMessage", "Lio/realm/RealmResults;", "Ldev/octoshrimpy/quik/model/Message;", "threadId", "getMessage", "getMessageForPart", "getMessages", "query", "", "getOldMessageCounts", "", "getPart", "Ldev/octoshrimpy/quik/model/MmsPart;", "getPartsForConversation", "getUnreadCount", "getUnreadMessages", "getUnreadUnseenMessages", "insertReceivedSms", "subId", "address", "body", "sentTime", "insertSentSms", "date", "markAllSeen", "markDelivered", "markDeliveryFailed", "resultCode", "markFailed", "markRead", "threadIds", "markSeen", "markSending", "markSent", "markUnread", "resendMms", "message", "savePart", "Landroid/net/Uri;", "sendMessage", "addresses", "", "attachments", "Ldev/octoshrimpy/quik/model/Attachment;", "delay", "sendSms", "data_noAnalyticsRelease"})
@javax.inject.Singleton
public final class MessageRepositoryImpl implements dev.octoshrimpy.quik.repository.MessageRepository {
    private final dev.octoshrimpy.quik.manager.ActiveConversationManager activeConversationManager = null;
    private final android.content.Context context = null;
    private final dev.octoshrimpy.quik.manager.KeyManager messageIds = null;
    private final dev.octoshrimpy.quik.util.PhoneNumberUtils phoneNumberUtils = null;
    private final dev.octoshrimpy.quik.util.Preferences prefs = null;
    private final dev.octoshrimpy.quik.repository.SyncRepository syncRepository = null;
    
    @javax.inject.Inject
    public MessageRepositoryImpl(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.ActiveConversationManager activeConversationManager, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.KeyManager messageIds, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.PhoneNumberUtils phoneNumberUtils, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.Preferences prefs, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.SyncRepository syncRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.realm.RealmResults<dev.octoshrimpy.quik.model.Message> getMessages(long threadId, @org.jetbrains.annotations.NotNull
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public dev.octoshrimpy.quik.model.Message getMessage(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public dev.octoshrimpy.quik.model.Message getMessageForPart(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.realm.RealmResults<dev.octoshrimpy.quik.model.Message> getLastIncomingMessage(long threadId) {
        return null;
    }
    
    @java.lang.Override
    public long getUnreadCount() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public dev.octoshrimpy.quik.model.MmsPart getPart(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.realm.RealmResults<dev.octoshrimpy.quik.model.MmsPart> getPartsForConversation(long threadId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.net.Uri savePart(long id) {
        return null;
    }
    
    /**
     * Retrieves the list of messages which should be shown in the notification
     * for a given conversation
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.realm.RealmResults<dev.octoshrimpy.quik.model.Message> getUnreadUnseenMessages(long threadId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.realm.RealmResults<dev.octoshrimpy.quik.model.Message> getUnreadMessages(long threadId) {
        return null;
    }
    
    @java.lang.Override
    public void markAllSeen() {
    }
    
    @java.lang.Override
    public void markSeen(long threadId) {
    }
    
    @java.lang.Override
    public void markRead(@org.jetbrains.annotations.NotNull
    long... threadIds) {
    }
    
    @java.lang.Override
    public void markUnread(@org.jetbrains.annotations.NotNull
    long... threadIds) {
    }
    
    @java.lang.Override
    public void sendMessage(int subId, long threadId, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> addresses, @org.jetbrains.annotations.NotNull
    java.lang.String body, @org.jetbrains.annotations.NotNull
    java.util.List<? extends dev.octoshrimpy.quik.model.Attachment> attachments, int delay) {
    }
    
    @java.lang.Override
    public void sendSms(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.model.Message message) {
    }
    
    @java.lang.Override
    public void resendMms(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.model.Message message) {
    }
    
    @java.lang.Override
    public void cancelDelayedSms(long id) {
    }
    
    private final android.app.PendingIntent getIntentForDelayedSms(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dev.octoshrimpy.quik.model.Message insertSentSms(int subId, long threadId, @org.jetbrains.annotations.NotNull
    java.lang.String address, @org.jetbrains.annotations.NotNull
    java.lang.String body, long date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dev.octoshrimpy.quik.model.Message insertReceivedSms(int subId, @org.jetbrains.annotations.NotNull
    java.lang.String address, @org.jetbrains.annotations.NotNull
    java.lang.String body, long sentTime) {
        return null;
    }
    
    /**
     * Marks the message as sending, in case we need to retry sending it
     */
    @java.lang.Override
    public void markSending(long id) {
    }
    
    @java.lang.Override
    public void markSent(long id) {
    }
    
    @java.lang.Override
    public void markFailed(long id, int resultCode) {
    }
    
    @java.lang.Override
    public void markDelivered(long id) {
    }
    
    @java.lang.Override
    public void markDeliveryFailed(long id, int resultCode) {
    }
    
    @java.lang.Override
    public void deleteMessages(@org.jetbrains.annotations.NotNull
    long... messageIds) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.Map<java.lang.Long, java.lang.Integer> getOldMessageCounts(int maxAgeDays) {
        return null;
    }
    
    @java.lang.Override
    public void deleteOldMessages(int maxAgeDays) {
    }
}