package dev.octoshrimpy.quik.feature.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0002X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0002X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00140\u0013X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Ldev/octoshrimpy/quik/feature/main/DrawerBadgesExperiment;", "Ldev/octoshrimpy/quik/experiment/Experiment;", "", "context", "Landroid/content/Context;", "analyticsManager", "Ldev/octoshrimpy/quik/manager/AnalyticsManager;", "(Landroid/content/Context;Ldev/octoshrimpy/quik/manager/AnalyticsManager;)V", "default", "getDefault", "()Ljava/lang/Boolean;", "key", "", "getKey", "()Ljava/lang/String;", "qualifies", "getQualifies", "()Z", "variants", "", "Ldev/octoshrimpy/quik/experiment/Variant;", "getVariants", "()Ljava/util/List;", "presentation_noAnalyticsRelease"})
public final class DrawerBadgesExperiment extends dev.octoshrimpy.quik.experiment.Experiment<java.lang.Boolean> {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String key = "Drawer Badges";
    @org.jetbrains.annotations.NotNull
    private final java.util.List<dev.octoshrimpy.quik.experiment.Variant<java.lang.Boolean>> variants = null;
    private final boolean qualifies = true;
    
    @javax.inject.Inject
    public DrawerBadgesExperiment(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.AnalyticsManager analyticsManager) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected java.lang.String getKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected java.util.List<dev.octoshrimpy.quik.experiment.Variant<java.lang.Boolean>> getVariants() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected java.lang.Boolean getDefault() {
        return null;
    }
    
    @java.lang.Override
    protected boolean getQualifies() {
        return false;
    }
}