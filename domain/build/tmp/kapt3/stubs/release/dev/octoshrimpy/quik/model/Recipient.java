package dev.octoshrimpy.quik.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u0018\u001a\u00020\u0005R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015\u00a8\u0006\u0019"}, d2 = {"Ldev/octoshrimpy/quik/model/Recipient;", "Lio/realm/RealmObject;", "id", "", "address", "", "contact", "Ldev/octoshrimpy/quik/model/Contact;", "lastUpdate", "(JLjava/lang/String;Ldev/octoshrimpy/quik/model/Contact;J)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getContact", "()Ldev/octoshrimpy/quik/model/Contact;", "setContact", "(Ldev/octoshrimpy/quik/model/Contact;)V", "getId", "()J", "setId", "(J)V", "getLastUpdate", "setLastUpdate", "getDisplayName", "domain_release"})
public class Recipient extends io.realm.RealmObject {
    @io.realm.annotations.PrimaryKey
    private long id;
    @org.jetbrains.annotations.NotNull
    private java.lang.String address;
    @org.jetbrains.annotations.Nullable
    private dev.octoshrimpy.quik.model.Contact contact;
    private long lastUpdate;
    
    public Recipient() {
        super();
    }
    
    public Recipient(long id, @org.jetbrains.annotations.NotNull
    java.lang.String address, @org.jetbrains.annotations.Nullable
    dev.octoshrimpy.quik.model.Contact contact, long lastUpdate) {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final dev.octoshrimpy.quik.model.Contact getContact() {
        return null;
    }
    
    public final void setContact(@org.jetbrains.annotations.Nullable
    dev.octoshrimpy.quik.model.Contact p0) {
    }
    
    public final long getLastUpdate() {
        return 0L;
    }
    
    public final void setLastUpdate(long p0) {
    }
    
    /**
     * Return a string that can be displayed to represent the name of this contact
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDisplayName() {
        return null;
    }
}