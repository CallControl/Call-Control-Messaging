package dev.octoshrimpy.quik.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Ldev/octoshrimpy/quik/model/ContactGroup;", "Lio/realm/RealmObject;", "id", "", "title", "", "contacts", "Lio/realm/RealmList;", "Ldev/octoshrimpy/quik/model/Contact;", "(JLjava/lang/String;Lio/realm/RealmList;)V", "getContacts", "()Lio/realm/RealmList;", "setContacts", "(Lio/realm/RealmList;)V", "getId", "()J", "setId", "(J)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "domain_release"})
public class ContactGroup extends io.realm.RealmObject {
    @io.realm.annotations.PrimaryKey
    private long id;
    @org.jetbrains.annotations.NotNull
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull
    private io.realm.RealmList<dev.octoshrimpy.quik.model.Contact> contacts;
    
    public ContactGroup() {
        super();
    }
    
    public ContactGroup(long id, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    io.realm.RealmList<dev.octoshrimpy.quik.model.Contact> contacts) {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.realm.RealmList<dev.octoshrimpy.quik.model.Contact> getContacts() {
        return null;
    }
    
    public final void setContacts(@org.jetbrains.annotations.NotNull
    io.realm.RealmList<dev.octoshrimpy.quik.model.Contact> p0) {
    }
}