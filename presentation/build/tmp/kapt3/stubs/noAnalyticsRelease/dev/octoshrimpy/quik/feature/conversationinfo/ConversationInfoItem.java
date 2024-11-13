package dev.octoshrimpy.quik.feature.conversationinfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Ldev/octoshrimpy/quik/feature/conversationinfo/ConversationInfoItem;", "", "()V", "ConversationInfoMedia", "ConversationInfoRecipient", "ConversationInfoSettings", "Ldev/octoshrimpy/quik/feature/conversationinfo/ConversationInfoItem$ConversationInfoMedia;", "Ldev/octoshrimpy/quik/feature/conversationinfo/ConversationInfoItem$ConversationInfoRecipient;", "Ldev/octoshrimpy/quik/feature/conversationinfo/ConversationInfoItem$ConversationInfoSettings;", "presentation_noAnalyticsRelease"})
public abstract class ConversationInfoItem {
    
    private ConversationInfoItem() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldev/octoshrimpy/quik/feature/conversationinfo/ConversationInfoItem$ConversationInfoRecipient;", "Ldev/octoshrimpy/quik/feature/conversationinfo/ConversationInfoItem;", "value", "Ldev/octoshrimpy/quik/model/Recipient;", "(Ldev/octoshrimpy/quik/model/Recipient;)V", "getValue", "()Ldev/octoshrimpy/quik/model/Recipient;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_noAnalyticsRelease"})
    public static final class ConversationInfoRecipient extends dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoItem {
        @org.jetbrains.annotations.NotNull
        private final dev.octoshrimpy.quik.model.Recipient value = null;
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoItem.ConversationInfoRecipient copy(@org.jetbrains.annotations.NotNull
        dev.octoshrimpy.quik.model.Recipient value) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ConversationInfoRecipient(@org.jetbrains.annotations.NotNull
        dev.octoshrimpy.quik.model.Recipient value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.model.Recipient component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.model.Recipient getValue() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001d"}, d2 = {"Ldev/octoshrimpy/quik/feature/conversationinfo/ConversationInfoItem$ConversationInfoSettings;", "Ldev/octoshrimpy/quik/feature/conversationinfo/ConversationInfoItem;", "name", "", "recipients", "Lio/realm/RealmList;", "Ldev/octoshrimpy/quik/model/Recipient;", "archived", "", "blocked", "(Ljava/lang/String;Lio/realm/RealmList;ZZ)V", "getArchived", "()Z", "getBlocked", "getName", "()Ljava/lang/String;", "getRecipients", "()Lio/realm/RealmList;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "presentation_noAnalyticsRelease"})
    public static final class ConversationInfoSettings extends dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoItem {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull
        private final io.realm.RealmList<dev.octoshrimpy.quik.model.Recipient> recipients = null;
        private final boolean archived = false;
        private final boolean blocked = false;
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoItem.ConversationInfoSettings copy(@org.jetbrains.annotations.NotNull
        java.lang.String name, @org.jetbrains.annotations.NotNull
        io.realm.RealmList<dev.octoshrimpy.quik.model.Recipient> recipients, boolean archived, boolean blocked) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ConversationInfoSettings(@org.jetbrains.annotations.NotNull
        java.lang.String name, @org.jetbrains.annotations.NotNull
        io.realm.RealmList<dev.octoshrimpy.quik.model.Recipient> recipients, boolean archived, boolean blocked) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final io.realm.RealmList<dev.octoshrimpy.quik.model.Recipient> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final io.realm.RealmList<dev.octoshrimpy.quik.model.Recipient> getRecipients() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean getArchived() {
            return false;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean getBlocked() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldev/octoshrimpy/quik/feature/conversationinfo/ConversationInfoItem$ConversationInfoMedia;", "Ldev/octoshrimpy/quik/feature/conversationinfo/ConversationInfoItem;", "value", "Ldev/octoshrimpy/quik/model/MmsPart;", "(Ldev/octoshrimpy/quik/model/MmsPart;)V", "getValue", "()Ldev/octoshrimpy/quik/model/MmsPart;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_noAnalyticsRelease"})
    public static final class ConversationInfoMedia extends dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoItem {
        @org.jetbrains.annotations.NotNull
        private final dev.octoshrimpy.quik.model.MmsPart value = null;
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoItem.ConversationInfoMedia copy(@org.jetbrains.annotations.NotNull
        dev.octoshrimpy.quik.model.MmsPart value) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ConversationInfoMedia(@org.jetbrains.annotations.NotNull
        dev.octoshrimpy.quik.model.MmsPart value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.model.MmsPart component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.model.MmsPart getValue() {
            return null;
        }
    }
}