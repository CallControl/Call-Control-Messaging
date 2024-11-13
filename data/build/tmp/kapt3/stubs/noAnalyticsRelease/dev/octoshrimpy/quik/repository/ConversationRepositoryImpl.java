package dev.octoshrimpy.quik.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00020\u0010\"\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0011H\u0016J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0011H\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0011H\u0002J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\n\u0010\u000f\u001a\u00020\u0010\"\u00020\u0011H\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001eH\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0011H\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00142\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00142\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001eH\u0016J\u0012\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020\u0011H\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\u0013H\u0016J\u0017\u0010\'\u001a\u0004\u0018\u00010\u00112\u0006\u0010(\u001a\u00020!H\u0016\u00a2\u0006\u0002\u0010)J\u001d\u0010\'\u001a\u0004\u0018\u00010\u00112\f\u0010*\u001a\b\u0012\u0004\u0012\u00020!0+H\u0016\u00a2\u0006\u0002\u0010,J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00140\u001eH\u0016J\u0014\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001e0/H\u0016J\u0014\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001e0/H\u0016J\u0014\u00101\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00020\u0010\"\u00020\u0011H\u0016J(\u00102\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u001e2\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010!H\u0016J\u0014\u00106\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00020\u0010\"\u00020\u0011H\u0016J\u0014\u00107\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00020\u0010\"\u00020\u0011H\u0016J\u0014\u00108\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00020\u0010\"\u00020\u0011H\u0016J\u0014\u00109\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00020\u0010\"\u00020\u0011H\u0016J\u0018\u0010:\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010;\u001a\u00020!H\u0016J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u001e2\u0006\u0010>\u001a\u00020?H\u0016J\u0018\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u00112\u0006\u0010C\u001a\u00020!H\u0016J\u0014\u0010D\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00020\u0010\"\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006E"}, d2 = {"Ldev/octoshrimpy/quik/repository/ConversationRepositoryImpl;", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "context", "Landroid/content/Context;", "conversationFilter", "Ldev/octoshrimpy/quik/filter/ConversationFilter;", "cursorToConversation", "Ldev/octoshrimpy/quik/mapper/CursorToConversation;", "cursorToRecipient", "Ldev/octoshrimpy/quik/mapper/CursorToRecipient;", "phoneNumberUtils", "Ldev/octoshrimpy/quik/util/PhoneNumberUtils;", "(Landroid/content/Context;Ldev/octoshrimpy/quik/filter/ConversationFilter;Ldev/octoshrimpy/quik/mapper/CursorToConversation;Ldev/octoshrimpy/quik/mapper/CursorToRecipient;Ldev/octoshrimpy/quik/util/PhoneNumberUtils;)V", "deleteConversations", "", "threadIds", "", "", "getBlockedConversations", "Lio/realm/RealmResults;", "Ldev/octoshrimpy/quik/model/Conversation;", "getBlockedConversationsAsync", "getConversation", "threadId", "getConversationAsync", "getConversationFromCp", "getConversations", "archived", "", "getConversationsSnapshot", "", "getOrCreateConversation", "address", "", "addresses", "getRecipient", "Ldev/octoshrimpy/quik/model/Recipient;", "recipientId", "getRecipients", "getThreadId", "recipient", "(Ljava/lang/String;)Ljava/lang/Long;", "recipients", "", "(Ljava/util/Collection;)Ljava/lang/Long;", "getTopConversations", "getUnmanagedConversations", "Lio/reactivex/Observable;", "getUnmanagedRecipients", "markArchived", "markBlocked", "blockingClient", "", "blockReason", "markPinned", "markUnarchived", "markUnblocked", "markUnpinned", "saveDraft", "draft", "searchConversations", "Ldev/octoshrimpy/quik/model/SearchResult;", "query", "", "setConversationName", "Lio/reactivex/Completable;", "id", "name", "updateConversations", "data_noAnalyticsRelease"})
public final class ConversationRepositoryImpl implements dev.octoshrimpy.quik.repository.ConversationRepository {
    private final android.content.Context context = null;
    private final dev.octoshrimpy.quik.filter.ConversationFilter conversationFilter = null;
    private final dev.octoshrimpy.quik.mapper.CursorToConversation cursorToConversation = null;
    private final dev.octoshrimpy.quik.mapper.CursorToRecipient cursorToRecipient = null;
    private final dev.octoshrimpy.quik.util.PhoneNumberUtils phoneNumberUtils = null;
    
    @javax.inject.Inject
    public ConversationRepositoryImpl(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.filter.ConversationFilter conversationFilter, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.mapper.CursorToConversation cursorToConversation, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.mapper.CursorToRecipient cursorToRecipient, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.PhoneNumberUtils phoneNumberUtils) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.realm.RealmResults<dev.octoshrimpy.quik.model.Conversation> getConversations(boolean archived) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<dev.octoshrimpy.quik.model.Conversation> getConversationsSnapshot() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<dev.octoshrimpy.quik.model.Conversation> getTopConversations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Completable setConversationName(long id, @org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<dev.octoshrimpy.quik.model.SearchResult> searchConversations(@org.jetbrains.annotations.NotNull
    java.lang.CharSequence query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.realm.RealmResults<dev.octoshrimpy.quik.model.Conversation> getBlockedConversations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.realm.RealmResults<dev.octoshrimpy.quik.model.Conversation> getBlockedConversationsAsync() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dev.octoshrimpy.quik.model.Conversation getConversationAsync(long threadId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public dev.octoshrimpy.quik.model.Conversation getConversation(long threadId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.realm.RealmResults<dev.octoshrimpy.quik.model.Conversation> getConversations(@org.jetbrains.annotations.NotNull
    long... threadIds) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<java.util.List<dev.octoshrimpy.quik.model.Conversation>> getUnmanagedConversations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.realm.RealmResults<dev.octoshrimpy.quik.model.Recipient> getRecipients() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<java.util.List<dev.octoshrimpy.quik.model.Recipient>> getUnmanagedRecipients() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public dev.octoshrimpy.quik.model.Recipient getRecipient(long recipientId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Long getThreadId(@org.jetbrains.annotations.NotNull
    java.lang.String recipient) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Long getThreadId(@org.jetbrains.annotations.NotNull
    java.util.Collection<java.lang.String> recipients) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public dev.octoshrimpy.quik.model.Conversation getOrCreateConversation(long threadId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public dev.octoshrimpy.quik.model.Conversation getOrCreateConversation(@org.jetbrains.annotations.NotNull
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public dev.octoshrimpy.quik.model.Conversation getOrCreateConversation(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> addresses) {
        return null;
    }
    
    @java.lang.Override
    public void saveDraft(long threadId, @org.jetbrains.annotations.NotNull
    java.lang.String draft) {
    }
    
    @java.lang.Override
    public void updateConversations(@org.jetbrains.annotations.NotNull
    long... threadIds) {
    }
    
    @java.lang.Override
    public void markArchived(@org.jetbrains.annotations.NotNull
    long... threadIds) {
    }
    
    @java.lang.Override
    public void markUnarchived(@org.jetbrains.annotations.NotNull
    long... threadIds) {
    }
    
    @java.lang.Override
    public void markPinned(@org.jetbrains.annotations.NotNull
    long... threadIds) {
    }
    
    @java.lang.Override
    public void markUnpinned(@org.jetbrains.annotations.NotNull
    long... threadIds) {
    }
    
    @java.lang.Override
    public void markBlocked(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> threadIds, int blockingClient, @org.jetbrains.annotations.Nullable
    java.lang.String blockReason) {
    }
    
    @java.lang.Override
    public void markUnblocked(@org.jetbrains.annotations.NotNull
    long... threadIds) {
    }
    
    @java.lang.Override
    public void deleteConversations(@org.jetbrains.annotations.NotNull
    long... threadIds) {
    }
    
    /**
     * Returns a [Conversation] from the system SMS ContentProvider, based on the [threadId]
     *
     * It should be noted that even if we have a valid [threadId], that does not guarantee that
     * we can return a [Conversation]. On some devices, the ContentProvider won't return the
     * conversation unless it contains at least 1 message
     */
    private final dev.octoshrimpy.quik.model.Conversation getConversationFromCp(long threadId) {
        return null;
    }
}