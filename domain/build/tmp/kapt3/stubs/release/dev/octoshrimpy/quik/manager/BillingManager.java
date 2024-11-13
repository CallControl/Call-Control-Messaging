package dev.octoshrimpy.quik.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016J\u0011\u0010\u000b\u001a\u00020\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0011\u0010\u0014\u001a\u00020\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Ldev/octoshrimpy/quik/manager/BillingManager;", "", "products", "Lio/reactivex/Observable;", "", "Ldev/octoshrimpy/quik/manager/BillingManager$Product;", "getProducts", "()Lio/reactivex/Observable;", "upgradeStatus", "", "getUpgradeStatus", "checkForPurchases", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initiatePurchaseFlow", "activity", "Landroid/app/Activity;", "sku", "", "(Landroid/app/Activity;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryProducts", "Companion", "Product", "domain_release"})
public abstract interface BillingManager {
    @org.jetbrains.annotations.NotNull
    public static final dev.octoshrimpy.quik.manager.BillingManager.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SKU_PLUS = "remove_ads";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SKU_PLUS_DONATE = "qksms_plus_donate";
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.util.List<dev.octoshrimpy.quik.manager.BillingManager.Product>> getProducts();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> getUpgradeStatus();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object checkForPurchases(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object queryProducts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object initiatePurchaseFlow(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    java.lang.String sku, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0015"}, d2 = {"Ldev/octoshrimpy/quik/manager/BillingManager$Product;", "", "sku", "", "price", "priceCurrencyCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPrice", "()Ljava/lang/String;", "getPriceCurrencyCode", "getSku", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"})
    public static final class Product {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String sku = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String price = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String priceCurrencyCode = null;
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.manager.BillingManager.Product copy(@org.jetbrains.annotations.NotNull
        java.lang.String sku, @org.jetbrains.annotations.NotNull
        java.lang.String price, @org.jetbrains.annotations.NotNull
        java.lang.String priceCurrencyCode) {
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
        
        public Product(@org.jetbrains.annotations.NotNull
        java.lang.String sku, @org.jetbrains.annotations.NotNull
        java.lang.String price, @org.jetbrains.annotations.NotNull
        java.lang.String priceCurrencyCode) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getSku() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPriceCurrencyCode() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Ldev/octoshrimpy/quik/manager/BillingManager$Companion;", "", "()V", "SKU_PLUS", "", "SKU_PLUS_DONATE", "domain_release"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String SKU_PLUS = "remove_ads";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String SKU_PLUS_DONATE = "qksms_plus_donate";
        
        private Companion() {
            super();
        }
    }
}