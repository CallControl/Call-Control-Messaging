package dev.octoshrimpy.quik.feature.settings.about;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&\u00a8\u0006\u0006"}, d2 = {"Ldev/octoshrimpy/quik/feature/settings/about/AboutView;", "Ldev/octoshrimpy/quik/common/base/QkViewContract;", "", "preferenceClicks", "Lio/reactivex/Observable;", "Ldev/octoshrimpy/quik/common/widget/PreferenceView;", "presentation_noAnalyticsRelease"})
public abstract interface AboutView extends dev.octoshrimpy.quik.common.base.QkViewContract<kotlin.Unit> {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<dev.octoshrimpy.quik.common.widget.PreferenceView> preferenceClicks();
}