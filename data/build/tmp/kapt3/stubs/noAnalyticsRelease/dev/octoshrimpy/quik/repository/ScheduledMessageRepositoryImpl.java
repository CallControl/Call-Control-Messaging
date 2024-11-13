package dev.octoshrimpy.quik.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0016JD\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Ldev/octoshrimpy/quik/repository/ScheduledMessageRepositoryImpl;", "Ldev/octoshrimpy/quik/repository/ScheduledMessageRepository;", "()V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "clearDisposables", "", "deleteScheduledMessage", "id", "", "getScheduledMessage", "Ldev/octoshrimpy/quik/model/ScheduledMessage;", "getScheduledMessages", "Lio/realm/RealmResults;", "saveScheduledMessage", "date", "subId", "", "recipients", "", "", "sendAsGroup", "", "body", "attachments", "data_noAnalyticsRelease"})
public final class ScheduledMessageRepositoryImpl implements dev.octoshrimpy.quik.repository.ScheduledMessageRepository {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    
    @javax.inject.Inject
    public ScheduledMessageRepositoryImpl() {
        super();
    }
    
    @java.lang.Override
    public void saveScheduledMessage(long date, int subId, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> recipients, boolean sendAsGroup, @org.jetbrains.annotations.NotNull
    java.lang.String body, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> attachments) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.realm.RealmResults<dev.octoshrimpy.quik.model.ScheduledMessage> getScheduledMessages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public dev.octoshrimpy.quik.model.ScheduledMessage getScheduledMessage(long id) {
        return null;
    }
    
    @java.lang.Override
    public void deleteScheduledMessage(long id) {
    }
    
    public final void clearDisposables() {
    }
}