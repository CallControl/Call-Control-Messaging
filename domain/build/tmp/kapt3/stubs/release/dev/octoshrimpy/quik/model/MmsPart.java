package dev.octoshrimpy.quik.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u0004\u0018\u00010\u0012J\u0006\u0010$\u001a\u00020%R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u001a\u0010 \u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016\u00a8\u0006&"}, d2 = {"Ldev/octoshrimpy/quik/model/MmsPart;", "Lio/realm/RealmObject;", "()V", "id", "", "getId", "()J", "setId", "(J)V", "messageId", "getMessageId", "setMessageId", "messages", "Lio/realm/RealmResults;", "Ldev/octoshrimpy/quik/model/Message;", "getMessages", "()Lio/realm/RealmResults;", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "seq", "", "getSeq", "()I", "setSeq", "(I)V", "text", "getText", "setText", "type", "getType", "setType", "getSummary", "getUri", "Landroid/net/Uri;", "domain_release"})
public class MmsPart extends io.realm.RealmObject {
    @io.realm.annotations.PrimaryKey
    private long id = 0L;
    @io.realm.annotations.Index
    private long messageId = 0L;
    @org.jetbrains.annotations.NotNull
    private java.lang.String type = "";
    private int seq = -1;
    @org.jetbrains.annotations.Nullable
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable
    private java.lang.String text;
    @org.jetbrains.annotations.Nullable
    @io.realm.annotations.LinkingObjects(value = "parts")
    private final io.realm.RealmResults<dev.octoshrimpy.quik.model.Message> messages = null;
    
    public MmsPart() {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    public final long getMessageId() {
        return 0L;
    }
    
    public final void setMessageId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getSeq() {
        return 0;
    }
    
    public final void setSeq(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getText() {
        return null;
    }
    
    public final void setText(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final io.realm.RealmResults<dev.octoshrimpy.quik.model.Message> getMessages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.net.Uri getUri() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSummary() {
        return null;
    }
}