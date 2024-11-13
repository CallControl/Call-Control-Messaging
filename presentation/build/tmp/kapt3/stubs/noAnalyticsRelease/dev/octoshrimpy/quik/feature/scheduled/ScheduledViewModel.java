package dev.octoshrimpy.quik.feature.scheduled;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Ldev/octoshrimpy/quik/feature/scheduled/ScheduledViewModel;", "Ldev/octoshrimpy/quik/common/base/QkViewModel;", "Ldev/octoshrimpy/quik/feature/scheduled/ScheduledView;", "Ldev/octoshrimpy/quik/feature/scheduled/ScheduledState;", "billingManager", "Ldev/octoshrimpy/quik/manager/BillingManager;", "context", "Landroid/content/Context;", "navigator", "Ldev/octoshrimpy/quik/common/Navigator;", "scheduledMessageRepo", "Ldev/octoshrimpy/quik/repository/ScheduledMessageRepository;", "sendScheduledMessage", "Ldev/octoshrimpy/quik/interactor/SendScheduledMessage;", "(Ldev/octoshrimpy/quik/manager/BillingManager;Landroid/content/Context;Ldev/octoshrimpy/quik/common/Navigator;Ldev/octoshrimpy/quik/repository/ScheduledMessageRepository;Ldev/octoshrimpy/quik/interactor/SendScheduledMessage;)V", "bindView", "", "view", "presentation_noAnalyticsRelease"})
public final class ScheduledViewModel extends dev.octoshrimpy.quik.common.base.QkViewModel<dev.octoshrimpy.quik.feature.scheduled.ScheduledView, dev.octoshrimpy.quik.feature.scheduled.ScheduledState> {
    private final android.content.Context context = null;
    private final dev.octoshrimpy.quik.common.Navigator navigator = null;
    private final dev.octoshrimpy.quik.repository.ScheduledMessageRepository scheduledMessageRepo = null;
    private final dev.octoshrimpy.quik.interactor.SendScheduledMessage sendScheduledMessage = null;
    
    @javax.inject.Inject
    public ScheduledViewModel(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.BillingManager billingManager, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.Navigator navigator, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ScheduledMessageRepository scheduledMessageRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.SendScheduledMessage sendScheduledMessage) {
        super(null);
    }
    
    @java.lang.Override
    public void bindView(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.scheduled.ScheduledView view) {
    }
}