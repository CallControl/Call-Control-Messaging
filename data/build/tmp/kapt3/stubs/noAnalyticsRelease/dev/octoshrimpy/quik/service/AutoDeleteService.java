package dev.octoshrimpy.quik.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Ldev/octoshrimpy/quik/service/AutoDeleteService;", "Landroid/app/job/JobService;", "()V", "deleteOldMessages", "Ldev/octoshrimpy/quik/interactor/DeleteOldMessages;", "getDeleteOldMessages", "()Ldev/octoshrimpy/quik/interactor/DeleteOldMessages;", "setDeleteOldMessages", "(Ldev/octoshrimpy/quik/interactor/DeleteOldMessages;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "onStartJob", "", "params", "Landroid/app/job/JobParameters;", "onStopJob", "Companion", "data_noAnalyticsRelease"})
public final class AutoDeleteService extends android.app.job.JobService {
    @org.jetbrains.annotations.NotNull
    public static final dev.octoshrimpy.quik.service.AutoDeleteService.Companion Companion = null;
    private static final int JobId = 8120235;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.interactor.DeleteOldMessages deleteOldMessages;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    
    public AutoDeleteService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.interactor.DeleteOldMessages getDeleteOldMessages() {
        return null;
    }
    
    public final void setDeleteOldMessages(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.DeleteOldMessages p0) {
    }
    
    @java.lang.Override
    public boolean onStartJob(@org.jetbrains.annotations.Nullable
    android.app.job.JobParameters params) {
        return false;
    }
    
    @java.lang.Override
    public boolean onStopJob(@org.jetbrains.annotations.Nullable
    android.app.job.JobParameters params) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Ldev/octoshrimpy/quik/service/AutoDeleteService$Companion;", "", "()V", "JobId", "", "cancelJob", "", "context", "Landroid/content/Context;", "scheduleJob", "data_noAnalyticsRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @android.annotation.SuppressLint(value = {"MissingPermission"})
        public final void scheduleJob(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
        
        public final void cancelJob(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
    }
}