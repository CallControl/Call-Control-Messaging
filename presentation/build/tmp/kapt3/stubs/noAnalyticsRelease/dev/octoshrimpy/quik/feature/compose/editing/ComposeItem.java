package dev.octoshrimpy.quik.feature.compose.editing;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&\u0082\u0001\u0005\u000b\f\r\u000e\u000f\u00a8\u0006\u0010"}, d2 = {"Ldev/octoshrimpy/quik/feature/compose/editing/ComposeItem;", "", "()V", "getContacts", "", "Ldev/octoshrimpy/quik/model/Contact;", "Group", "New", "Person", "Recent", "Starred", "Ldev/octoshrimpy/quik/feature/compose/editing/ComposeItem$Group;", "Ldev/octoshrimpy/quik/feature/compose/editing/ComposeItem$New;", "Ldev/octoshrimpy/quik/feature/compose/editing/ComposeItem$Person;", "Ldev/octoshrimpy/quik/feature/compose/editing/ComposeItem$Recent;", "Ldev/octoshrimpy/quik/feature/compose/editing/ComposeItem$Starred;", "presentation_noAnalyticsRelease"})
public abstract class ComposeItem {
    
    private ComposeItem() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<dev.octoshrimpy.quik.model.Contact> getContacts();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Ldev/octoshrimpy/quik/feature/compose/editing/ComposeItem$New;", "Ldev/octoshrimpy/quik/feature/compose/editing/ComposeItem;", "value", "Ldev/octoshrimpy/quik/model/Contact;", "(Ldev/octoshrimpy/quik/model/Contact;)V", "getValue", "()Ldev/octoshrimpy/quik/model/Contact;", "component1", "copy", "equals", "", "other", "", "getContacts", "", "hashCode", "", "toString", "", "presentation_noAnalyticsRelease"})
    public static final class New extends dev.octoshrimpy.quik.feature.compose.editing.ComposeItem {
        @org.jetbrains.annotations.NotNull
        private final dev.octoshrimpy.quik.model.Contact value = null;
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.feature.compose.editing.ComposeItem.New copy(@org.jetbrains.annotations.NotNull
        dev.octoshrimpy.quik.model.Contact value) {
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
        
        public New(@org.jetbrains.annotations.NotNull
        dev.octoshrimpy.quik.model.Contact value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.model.Contact component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.model.Contact getValue() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.util.List<dev.octoshrimpy.quik.model.Contact> getContacts() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Ldev/octoshrimpy/quik/feature/compose/editing/ComposeItem$Recent;", "Ldev/octoshrimpy/quik/feature/compose/editing/ComposeItem;", "value", "Ldev/octoshrimpy/quik/model/Conversation;", "(Ldev/octoshrimpy/quik/model/Conversation;)V", "getValue", "()Ldev/octoshrimpy/quik/model/Conversation;", "component1", "copy", "equals", "", "other", "", "getContacts", "", "Ldev/octoshrimpy/quik/model/Contact;", "hashCode", "", "toString", "", "presentation_noAnalyticsRelease"})
    public static final class Recent extends dev.octoshrimpy.quik.feature.compose.editing.ComposeItem {
        @org.jetbrains.annotations.NotNull
        private final dev.octoshrimpy.quik.model.Conversation value = null;
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.feature.compose.editing.ComposeItem.Recent copy(@org.jetbrains.annotations.NotNull
        dev.octoshrimpy.quik.model.Conversation value) {
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
        
        public Recent(@org.jetbrains.annotations.NotNull
        dev.octoshrimpy.quik.model.Conversation value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.model.Conversation component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.model.Conversation getValue() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.util.List<dev.octoshrimpy.quik.model.Contact> getContacts() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Ldev/octoshrimpy/quik/feature/compose/editing/ComposeItem$Starred;", "Ldev/octoshrimpy/quik/feature/compose/editing/ComposeItem;", "value", "Ldev/octoshrimpy/quik/model/Contact;", "(Ldev/octoshrimpy/quik/model/Contact;)V", "getValue", "()Ldev/octoshrimpy/quik/model/Contact;", "component1", "copy", "equals", "", "other", "", "getContacts", "", "hashCode", "", "toString", "", "presentation_noAnalyticsRelease"})
    public static final class Starred extends dev.octoshrimpy.quik.feature.compose.editing.ComposeItem {
        @org.jetbrains.annotations.NotNull
        private final dev.octoshrimpy.quik.model.Contact value = null;
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.feature.compose.editing.ComposeItem.Starred copy(@org.jetbrains.annotations.NotNull
        dev.octoshrimpy.quik.model.Contact value) {
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
        
        public Starred(@org.jetbrains.annotations.NotNull
        dev.octoshrimpy.quik.model.Contact value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.model.Contact component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.model.Contact getValue() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.util.List<dev.octoshrimpy.quik.model.Contact> getContacts() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Ldev/octoshrimpy/quik/feature/compose/editing/ComposeItem$Group;", "Ldev/octoshrimpy/quik/feature/compose/editing/ComposeItem;", "value", "Ldev/octoshrimpy/quik/model/ContactGroup;", "(Ldev/octoshrimpy/quik/model/ContactGroup;)V", "getValue", "()Ldev/octoshrimpy/quik/model/ContactGroup;", "component1", "copy", "equals", "", "other", "", "getContacts", "", "Ldev/octoshrimpy/quik/model/Contact;", "hashCode", "", "toString", "", "presentation_noAnalyticsRelease"})
    public static final class Group extends dev.octoshrimpy.quik.feature.compose.editing.ComposeItem {
        @org.jetbrains.annotations.NotNull
        private final dev.octoshrimpy.quik.model.ContactGroup value = null;
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.feature.compose.editing.ComposeItem.Group copy(@org.jetbrains.annotations.NotNull
        dev.octoshrimpy.quik.model.ContactGroup value) {
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
        
        public Group(@org.jetbrains.annotations.NotNull
        dev.octoshrimpy.quik.model.ContactGroup value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.model.ContactGroup component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.model.ContactGroup getValue() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.util.List<dev.octoshrimpy.quik.model.Contact> getContacts() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Ldev/octoshrimpy/quik/feature/compose/editing/ComposeItem$Person;", "Ldev/octoshrimpy/quik/feature/compose/editing/ComposeItem;", "value", "Ldev/octoshrimpy/quik/model/Contact;", "(Ldev/octoshrimpy/quik/model/Contact;)V", "getValue", "()Ldev/octoshrimpy/quik/model/Contact;", "component1", "copy", "equals", "", "other", "", "getContacts", "", "hashCode", "", "toString", "", "presentation_noAnalyticsRelease"})
    public static final class Person extends dev.octoshrimpy.quik.feature.compose.editing.ComposeItem {
        @org.jetbrains.annotations.NotNull
        private final dev.octoshrimpy.quik.model.Contact value = null;
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.feature.compose.editing.ComposeItem.Person copy(@org.jetbrains.annotations.NotNull
        dev.octoshrimpy.quik.model.Contact value) {
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
        
        public Person(@org.jetbrains.annotations.NotNull
        dev.octoshrimpy.quik.model.Contact value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.model.Contact component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.model.Contact getValue() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.util.List<dev.octoshrimpy.quik.model.Contact> getContacts() {
            return null;
        }
    }
}