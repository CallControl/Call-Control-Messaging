package dev.octoshrimpy.quik.common.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR \u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Ldev/octoshrimpy/quik/common/util/BillingManagerImpl;", "Ldev/octoshrimpy/quik/manager/BillingManager;", "()V", "products", "Lio/reactivex/Observable;", "", "Ldev/octoshrimpy/quik/manager/BillingManager$Product;", "getProducts", "()Lio/reactivex/Observable;", "upgradeStatus", "", "getUpgradeStatus", "checkForPurchases", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initiatePurchaseFlow", "activity", "Landroid/app/Activity;", "sku", "", "(Landroid/app/Activity;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryProducts", "presentation_noAnalyticsRelease"})
@javax.inject.Singleton
public final class BillingManagerImpl implements dev.octoshrimpy.quik.manager.BillingManager {
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.Observable<java.util.List<dev.octoshrimpy.quik.manager.BillingManager.Product>> products = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.Observable<java.lang.Boolean> upgradeStatus = null;
    
    @javax.inject.Inject
    public BillingManagerImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<java.util.List<dev.octoshrimpy.quik.manager.BillingManager.Product>> getProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<java.lang.Boolean> getUpgradeStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object checkForPurchases(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object queryProducts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object initiatePurchaseFlow(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    java.lang.String sku, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}