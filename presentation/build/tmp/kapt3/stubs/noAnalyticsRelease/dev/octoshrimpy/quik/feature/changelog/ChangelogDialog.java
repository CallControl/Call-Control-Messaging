package dev.octoshrimpy.quik.feature.changelog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0011"}, d2 = {"Ldev/octoshrimpy/quik/feature/changelog/ChangelogDialog;", "", "activity", "Ldev/octoshrimpy/quik/feature/main/MainActivity;", "(Ldev/octoshrimpy/quik/feature/main/MainActivity;)V", "adapter", "Ldev/octoshrimpy/quik/feature/changelog/ChangelogAdapter;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "moreClicks", "Lio/reactivex/subjects/Subject;", "", "getMoreClicks", "()Lio/reactivex/subjects/Subject;", "show", "changelog", "Ldev/octoshrimpy/quik/manager/ChangelogManager$CumulativeChangelog;", "presentation_noAnalyticsRelease"})
public final class ChangelogDialog {
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<kotlin.Unit> moreClicks = null;
    private final androidx.appcompat.app.AlertDialog dialog = null;
    private final dev.octoshrimpy.quik.feature.changelog.ChangelogAdapter adapter = null;
    
    public ChangelogDialog(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.main.MainActivity activity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.Subject<kotlin.Unit> getMoreClicks() {
        return null;
    }
    
    public final void show(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.ChangelogManager.CumulativeChangelog changelog) {
    }
}