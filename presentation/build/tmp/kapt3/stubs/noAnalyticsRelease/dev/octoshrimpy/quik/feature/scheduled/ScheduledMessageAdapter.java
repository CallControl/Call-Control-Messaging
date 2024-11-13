package dev.octoshrimpy.quik.feature.scheduled;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020!H\u0016R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00060\u0012R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Ldev/octoshrimpy/quik/feature/scheduled/ScheduledMessageAdapter;", "Ldev/octoshrimpy/quik/common/base/QkRealmAdapter;", "Ldev/octoshrimpy/quik/model/ScheduledMessage;", "context", "Landroid/content/Context;", "contactRepo", "Ldev/octoshrimpy/quik/repository/ContactRepository;", "dateFormatter", "Ldev/octoshrimpy/quik/common/util/DateFormatter;", "phoneNumberUtils", "Ldev/octoshrimpy/quik/util/PhoneNumberUtils;", "(Landroid/content/Context;Ldev/octoshrimpy/quik/repository/ContactRepository;Ldev/octoshrimpy/quik/common/util/DateFormatter;Ldev/octoshrimpy/quik/util/PhoneNumberUtils;)V", "clicks", "Lio/reactivex/subjects/Subject;", "", "getClicks", "()Lio/reactivex/subjects/Subject;", "contactCache", "Ldev/octoshrimpy/quik/feature/scheduled/ScheduledMessageAdapter$ContactCache;", "contacts", "Lio/realm/RealmResults;", "Ldev/octoshrimpy/quik/model/Contact;", "getContacts", "()Lio/realm/RealmResults;", "contacts$delegate", "Lkotlin/Lazy;", "imagesViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "onBindViewHolder", "", "holder", "Ldev/octoshrimpy/quik/common/base/QkViewHolder;", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ContactCache", "presentation_noAnalyticsRelease"})
public final class ScheduledMessageAdapter extends dev.octoshrimpy.quik.common.base.QkRealmAdapter<dev.octoshrimpy.quik.model.ScheduledMessage> {
    private final android.content.Context context = null;
    private final dev.octoshrimpy.quik.repository.ContactRepository contactRepo = null;
    private final dev.octoshrimpy.quik.common.util.DateFormatter dateFormatter = null;
    private final dev.octoshrimpy.quik.util.PhoneNumberUtils phoneNumberUtils = null;
    private final kotlin.Lazy contacts$delegate = null;
    private final dev.octoshrimpy.quik.feature.scheduled.ScheduledMessageAdapter.ContactCache contactCache = null;
    private final androidx.recyclerview.widget.RecyclerView.RecycledViewPool imagesViewPool = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<java.lang.Long> clicks = null;
    
    @javax.inject.Inject
    public ScheduledMessageAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ContactRepository contactRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.DateFormatter dateFormatter, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.PhoneNumberUtils phoneNumberUtils) {
        super();
    }
    
    private final io.realm.RealmResults<dev.octoshrimpy.quik.model.Contact> getContacts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.Subject<java.lang.Long> getClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dev.octoshrimpy.quik.common.base.QkViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.base.QkViewHolder holder, int position) {
    }
    
    /**
     * Cache the contacts in a map by the address, because the messages we're binding don't have
     * a reference to the contact.
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\"\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0002\u00a8\u0006\b"}, d2 = {"Ldev/octoshrimpy/quik/feature/scheduled/ScheduledMessageAdapter$ContactCache;", "Ljava/util/HashMap;", "", "Ldev/octoshrimpy/quik/model/Contact;", "Lkotlin/collections/HashMap;", "(Ldev/octoshrimpy/quik/feature/scheduled/ScheduledMessageAdapter;)V", "get", "key", "presentation_noAnalyticsRelease"})
    final class ContactCache extends java.util.HashMap<java.lang.String, dev.octoshrimpy.quik.model.Contact> {
        
        public ContactCache() {
            super(0, 0.0F);
        }
        
        @java.lang.Override
        public final java.lang.Object get(java.lang.Object key) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        @java.lang.Override
        public dev.octoshrimpy.quik.model.Contact get(@org.jetbrains.annotations.NotNull
        java.lang.String key) {
            return null;
        }
        
        @java.lang.Override
        public final boolean containsKey(java.lang.Object key) {
            return false;
        }
        
        @java.lang.Override
        public boolean containsKey(java.lang.String key) {
            return false;
        }
        
        @java.lang.Override
        public boolean containsValue(dev.octoshrimpy.quik.model.Contact value) {
            return false;
        }
        
        @java.lang.Override
        public final boolean containsValue(java.lang.Object value) {
            return false;
        }
        
        @java.lang.Override
        public final java.util.Set<java.util.Map.Entry<java.lang.String, dev.octoshrimpy.quik.model.Contact>> entrySet() {
            return null;
        }
        
        @java.lang.Override
        public java.util.Set getEntries() {
            return null;
        }
        
        @java.lang.Override
        public java.util.Set getKeys() {
            return null;
        }
        
        @java.lang.Override
        public final java.lang.Object getOrDefault(java.lang.Object key, java.lang.Object defaultValue) {
            return null;
        }
        
        @java.lang.Override
        public dev.octoshrimpy.quik.model.Contact getOrDefault(java.lang.String key, dev.octoshrimpy.quik.model.Contact defaultValue) {
            return null;
        }
        
        @java.lang.Override
        public int getSize() {
            return 0;
        }
        
        @java.lang.Override
        public java.util.Collection getValues() {
            return null;
        }
        
        @java.lang.Override
        public final java.util.Set<java.lang.String> keySet() {
            return null;
        }
        
        @java.lang.Override
        public final java.lang.Object remove(java.lang.Object key) {
            return null;
        }
        
        @java.lang.Override
        public final boolean remove(java.lang.Object key, java.lang.Object value) {
            return false;
        }
        
        @java.lang.Override
        public dev.octoshrimpy.quik.model.Contact remove(java.lang.String key) {
            return null;
        }
        
        @java.lang.Override
        public boolean remove(java.lang.String key, dev.octoshrimpy.quik.model.Contact value) {
            return false;
        }
        
        @java.lang.Override
        public final int size() {
            return 0;
        }
        
        @java.lang.Override
        public final java.util.Collection<dev.octoshrimpy.quik.model.Contact> values() {
            return null;
        }
    }
}