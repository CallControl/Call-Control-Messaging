package dev.octoshrimpy.quik.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bg\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0002\u0010\u001aJ\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0!H\u0002J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020$0!H\u0002J\b\u0010&\u001a\u00020\'H\u0016J\u0012\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\'H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006-"}, d2 = {"Ldev/octoshrimpy/quik/repository/SyncRepositoryImpl;", "Ldev/octoshrimpy/quik/repository/SyncRepository;", "contentResolver", "Landroid/content/ContentResolver;", "conversationRepo", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "cursorToConversation", "Ldev/octoshrimpy/quik/mapper/CursorToConversation;", "cursorToMessage", "Ldev/octoshrimpy/quik/mapper/CursorToMessage;", "cursorToPart", "Ldev/octoshrimpy/quik/mapper/CursorToPart;", "cursorToRecipient", "Ldev/octoshrimpy/quik/mapper/CursorToRecipient;", "cursorToContact", "Ldev/octoshrimpy/quik/mapper/CursorToContact;", "cursorToContactGroup", "Ldev/octoshrimpy/quik/mapper/CursorToContactGroup;", "cursorToContactGroupMember", "Ldev/octoshrimpy/quik/mapper/CursorToContactGroupMember;", "keys", "Ldev/octoshrimpy/quik/manager/KeyManager;", "phoneNumberUtils", "Ldev/octoshrimpy/quik/util/PhoneNumberUtils;", "rxPrefs", "Lcom/f2prateek/rx/preferences2/RxSharedPreferences;", "(Landroid/content/ContentResolver;Ldev/octoshrimpy/quik/repository/ConversationRepository;Ldev/octoshrimpy/quik/mapper/CursorToConversation;Ldev/octoshrimpy/quik/mapper/CursorToMessage;Ldev/octoshrimpy/quik/mapper/CursorToPart;Ldev/octoshrimpy/quik/mapper/CursorToRecipient;Ldev/octoshrimpy/quik/mapper/CursorToContact;Ldev/octoshrimpy/quik/mapper/CursorToContactGroup;Ldev/octoshrimpy/quik/mapper/CursorToContactGroupMember;Ldev/octoshrimpy/quik/manager/KeyManager;Ldev/octoshrimpy/quik/util/PhoneNumberUtils;Lcom/f2prateek/rx/preferences2/RxSharedPreferences;)V", "syncProgress", "Lio/reactivex/subjects/Subject;", "Ldev/octoshrimpy/quik/repository/SyncRepository$SyncProgress;", "getSyncProgress", "()Lio/reactivex/subjects/Subject;", "getContactGroups", "", "Ldev/octoshrimpy/quik/model/ContactGroup;", "contacts", "Ldev/octoshrimpy/quik/model/Contact;", "getContacts", "syncContacts", "", "syncMessage", "Ldev/octoshrimpy/quik/model/Message;", "uri", "Landroid/net/Uri;", "syncMessages", "data_noAnalyticsRelease"})
@javax.inject.Singleton
public final class SyncRepositoryImpl implements dev.octoshrimpy.quik.repository.SyncRepository {
    private final android.content.ContentResolver contentResolver = null;
    private final dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo = null;
    private final dev.octoshrimpy.quik.mapper.CursorToConversation cursorToConversation = null;
    private final dev.octoshrimpy.quik.mapper.CursorToMessage cursorToMessage = null;
    private final dev.octoshrimpy.quik.mapper.CursorToPart cursorToPart = null;
    private final dev.octoshrimpy.quik.mapper.CursorToRecipient cursorToRecipient = null;
    private final dev.octoshrimpy.quik.mapper.CursorToContact cursorToContact = null;
    private final dev.octoshrimpy.quik.mapper.CursorToContactGroup cursorToContactGroup = null;
    private final dev.octoshrimpy.quik.mapper.CursorToContactGroupMember cursorToContactGroupMember = null;
    private final dev.octoshrimpy.quik.manager.KeyManager keys = null;
    private final dev.octoshrimpy.quik.util.PhoneNumberUtils phoneNumberUtils = null;
    private final com.f2prateek.rx.preferences2.RxSharedPreferences rxPrefs = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<dev.octoshrimpy.quik.repository.SyncRepository.SyncProgress> syncProgress = null;
    
    @javax.inject.Inject
    public SyncRepositoryImpl(@org.jetbrains.annotations.NotNull
    android.content.ContentResolver contentResolver, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.mapper.CursorToConversation cursorToConversation, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.mapper.CursorToMessage cursorToMessage, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.mapper.CursorToPart cursorToPart, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.mapper.CursorToRecipient cursorToRecipient, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.mapper.CursorToContact cursorToContact, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.mapper.CursorToContactGroup cursorToContactGroup, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.mapper.CursorToContactGroupMember cursorToContactGroupMember, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.KeyManager keys, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.PhoneNumberUtils phoneNumberUtils, @org.jetbrains.annotations.NotNull
    com.f2prateek.rx.preferences2.RxSharedPreferences rxPrefs) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.subjects.Subject<dev.octoshrimpy.quik.repository.SyncRepository.SyncProgress> getSyncProgress() {
        return null;
    }
    
    @java.lang.Override
    public void syncMessages() {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public dev.octoshrimpy.quik.model.Message syncMessage(@org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
        return null;
    }
    
    @java.lang.Override
    public void syncContacts() {
    }
    
    private final java.util.List<dev.octoshrimpy.quik.model.Contact> getContacts() {
        return null;
    }
    
    private final java.util.List<dev.octoshrimpy.quik.model.ContactGroup> getContactGroups(java.util.List<? extends dev.octoshrimpy.quik.model.Contact> contacts) {
        return null;
    }
}