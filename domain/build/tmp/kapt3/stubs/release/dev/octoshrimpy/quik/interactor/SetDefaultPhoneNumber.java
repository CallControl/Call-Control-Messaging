package dev.octoshrimpy.quik.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Ldev/octoshrimpy/quik/interactor/SetDefaultPhoneNumber;", "Ldev/octoshrimpy/quik/interactor/Interactor;", "Ldev/octoshrimpy/quik/interactor/SetDefaultPhoneNumber$Params;", "contactRepo", "Ldev/octoshrimpy/quik/repository/ContactRepository;", "(Ldev/octoshrimpy/quik/repository/ContactRepository;)V", "buildObservable", "Lio/reactivex/Flowable;", "params", "Params", "domain_release"})
public final class SetDefaultPhoneNumber extends dev.octoshrimpy.quik.interactor.Interactor<dev.octoshrimpy.quik.interactor.SetDefaultPhoneNumber.Params> {
    private final dev.octoshrimpy.quik.repository.ContactRepository contactRepo = null;
    
    @javax.inject.Inject
    public SetDefaultPhoneNumber(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ContactRepository contactRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Flowable<?> buildObservable(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.SetDefaultPhoneNumber.Params params) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Ldev/octoshrimpy/quik/interactor/SetDefaultPhoneNumber$Params;", "", "lookupKey", "", "phoneNumberId", "", "(Ljava/lang/String;J)V", "getLookupKey", "()Ljava/lang/String;", "getPhoneNumberId", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"})
    public static final class Params {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String lookupKey = null;
        private final long phoneNumberId = 0L;
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.interactor.SetDefaultPhoneNumber.Params copy(@org.jetbrains.annotations.NotNull
        java.lang.String lookupKey, long phoneNumberId) {
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
        
        public Params(@org.jetbrains.annotations.NotNull
        java.lang.String lookupKey, long phoneNumberId) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getLookupKey() {
            return null;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long getPhoneNumberId() {
            return 0L;
        }
    }
}