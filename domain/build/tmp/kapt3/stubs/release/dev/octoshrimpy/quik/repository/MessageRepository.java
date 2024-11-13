package dev.octoshrimpy.quik.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\u0006\u001a\u00020\u00032\n\u0010\u0007\u001a\u00020\b\"\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0005H&J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0014H&J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00162\u0006\u0010\n\u001a\u00020\u000bH&J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\r2\u0006\u0010\u000f\u001a\u00020\u0005H&J\b\u0010\u001a\u001a\u00020\u0005H&J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0005H&J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0005H&J(\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0005H&J0\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0005H&J\b\u0010$\u001a\u00020\u0003H&J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010&\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\'\u001a\u00020\u000bH&J\u0018\u0010(\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\'\u001a\u00020\u000bH&J\u0014\u0010)\u001a\u00020\u00032\n\u0010*\u001a\u00020\b\"\u00020\u0005H&J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0005H&J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010.\u001a\u00020\u00032\n\u0010*\u001a\u00020\b\"\u00020\u0005H&J\u0010\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u000eH&J\u0012\u00101\u001a\u0004\u0018\u0001022\u0006\u0010\u0004\u001a\u00020\u0005H&JF\u00103\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00052\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u0014052\u0006\u0010 \u001a\u00020\u00142\f\u00106\u001a\b\u0012\u0004\u0012\u000207052\b\b\u0002\u00108\u001a\u00020\u000bH&J\u0010\u00109\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u000eH&\u00a8\u0006:"}, d2 = {"Ldev/octoshrimpy/quik/repository/MessageRepository;", "", "cancelDelayedSms", "", "id", "", "deleteMessages", "messageIds", "", "deleteOldMessages", "maxAgeDays", "", "getLastIncomingMessage", "Lio/realm/RealmResults;", "Ldev/octoshrimpy/quik/model/Message;", "threadId", "getMessage", "getMessageForPart", "getMessages", "query", "", "getOldMessageCounts", "", "getPart", "Ldev/octoshrimpy/quik/model/MmsPart;", "getPartsForConversation", "getUnreadCount", "getUnreadMessages", "getUnreadUnseenMessages", "insertReceivedSms", "subId", "address", "body", "sentTime", "insertSentSms", "date", "markAllSeen", "markDelivered", "markDeliveryFailed", "resultCode", "markFailed", "markRead", "threadIds", "markSeen", "markSending", "markSent", "markUnread", "resendMms", "message", "savePart", "Landroid/net/Uri;", "sendMessage", "addresses", "", "attachments", "Ldev/octoshrimpy/quik/model/Attachment;", "delay", "sendSms", "domain_release"})
public abstract interface MessageRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.realm.RealmResults<dev.octoshrimpy.quik.model.Message> getMessages(long threadId, @org.jetbrains.annotations.NotNull
    java.lang.String query);
    
    @org.jetbrains.annotations.Nullable
    public abstract dev.octoshrimpy.quik.model.Message getMessage(long id);
    
    @org.jetbrains.annotations.Nullable
    public abstract dev.octoshrimpy.quik.model.Message getMessageForPart(long id);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.realm.RealmResults<dev.octoshrimpy.quik.model.Message> getLastIncomingMessage(long threadId);
    
    public abstract long getUnreadCount();
    
    @org.jetbrains.annotations.Nullable
    public abstract dev.octoshrimpy.quik.model.MmsPart getPart(long id);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.realm.RealmResults<dev.octoshrimpy.quik.model.MmsPart> getPartsForConversation(long threadId);
    
    @org.jetbrains.annotations.Nullable
    public abstract android.net.Uri savePart(long id);
    
    /**
     * Retrieves the list of messages which should be shown in the notification
     * for a given conversation
     */
    @org.jetbrains.annotations.NotNull
    public abstract io.realm.RealmResults<dev.octoshrimpy.quik.model.Message> getUnreadUnseenMessages(long threadId);
    
    /**
     * Retrieves the list of messages which should be shown in the quickreply popup
     * for a given conversation
     */
    @org.jetbrains.annotations.NotNull
    public abstract io.realm.RealmResults<dev.octoshrimpy.quik.model.Message> getUnreadMessages(long threadId);
    
    public abstract void markAllSeen();
    
    public abstract void markSeen(long threadId);
    
    public abstract void markRead(@org.jetbrains.annotations.NotNull
    long... threadIds);
    
    public abstract void markUnread(@org.jetbrains.annotations.NotNull
    long... threadIds);
    
    public abstract void sendMessage(int subId, long threadId, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> addresses, @org.jetbrains.annotations.NotNull
    java.lang.String body, @org.jetbrains.annotations.NotNull
    java.util.List<? extends dev.octoshrimpy.quik.model.Attachment> attachments, int delay);
    
    /**
     * Attempts to send the SMS message. This can be called if the message has already been persisted
     */
    public abstract void sendSms(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.model.Message message);
    
    public abstract void resendMms(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.model.Message message);
    
    /**
     * Attempts to cancel sending the message with the given id
     */
    public abstract void cancelDelayedSms(long id);
    
    @org.jetbrains.annotations.NotNull
    public abstract dev.octoshrimpy.quik.model.Message insertSentSms(int subId, long threadId, @org.jetbrains.annotations.NotNull
    java.lang.String address, @org.jetbrains.annotations.NotNull
    java.lang.String body, long date);
    
    @org.jetbrains.annotations.NotNull
    public abstract dev.octoshrimpy.quik.model.Message insertReceivedSms(int subId, @org.jetbrains.annotations.NotNull
    java.lang.String address, @org.jetbrains.annotations.NotNull
    java.lang.String body, long sentTime);
    
    /**
     * Marks the message as sending, in case we need to retry sending it
     */
    public abstract void markSending(long id);
    
    public abstract void markSent(long id);
    
    public abstract void markFailed(long id, int resultCode);
    
    public abstract void markDelivered(long id);
    
    public abstract void markDeliveryFailed(long id, int resultCode);
    
    public abstract void deleteMessages(@org.jetbrains.annotations.NotNull
    long... messageIds);
    
    /**
     * Returns the number of messages older than [maxAgeDays] per conversation
     */
    @org.jetbrains.annotations.NotNull
    public abstract java.util.Map<java.lang.Long, java.lang.Integer> getOldMessageCounts(int maxAgeDays);
    
    /**
     * Deletes all messages older than [maxAgeDays]
     */
    public abstract void deleteOldMessages(int maxAgeDays);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
}