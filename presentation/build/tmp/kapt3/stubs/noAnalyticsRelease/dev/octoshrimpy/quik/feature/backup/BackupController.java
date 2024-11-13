package dev.octoshrimpy.quik.feature.backup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0005J\f\u0010*\u001a\u0006\u0012\u0002\b\u00030+H\u0016J\f\u0010,\u001a\u0006\u0012\u0002\b\u00030+H\u0016J\f\u0010-\u001a\u0006\u0012\u0002\b\u00030+H\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0+H\u0016J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0+H\u0016J\f\u00100\u001a\u0006\u0012\u0002\b\u00030+H\u0016J\f\u00101\u001a\u0006\u0012\u0002\b\u00030+H\u0016J\u0010\u00102\u001a\u00020\b2\u0006\u00103\u001a\u000204H\u0014J\u0010\u00105\u001a\u00020\b2\u0006\u00106\u001a\u000207H\u0014J\b\u00108\u001a\u00020\bH\u0016J\u0010\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020\u0003H\u0016J\f\u0010;\u001a\u0006\u0012\u0002\b\u00030+H\u0016J\u0010\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020\u000bH\u0016J\u0010\u0010>\u001a\u00020\b2\u0006\u0010=\u001a\u00020\u000bH\u0016J\f\u0010?\u001a\u0006\u0012\u0002\b\u00030+H\u0016J\f\u0010@\u001a\u0006\u0012\u0002\b\u00030+H\u0016J\f\u0010A\u001a\u0006\u0012\u0002\b\u00030+H\u0016J\f\u0010B\u001a\u0006\u0012\u0002\b\u00030+H\u0016J\f\u0010C\u001a\u0006\u0012\u0002\b\u00030+H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b \u0010\u001cR\u001b\u0010\"\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b#\u0010\u001cR\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\'\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b(\u0010\u001c\u00a8\u0006D"}, d2 = {"Ldev/octoshrimpy/quik/feature/backup/BackupController;", "Ldev/octoshrimpy/quik/common/base/QkController;", "Ldev/octoshrimpy/quik/feature/backup/BackupView;", "Ldev/octoshrimpy/quik/feature/backup/BackupState;", "Ldev/octoshrimpy/quik/feature/backup/BackupPresenter;", "()V", "confirmRestoreCancelSubject", "Lio/reactivex/subjects/Subject;", "", "confirmRestoreConfirmSubject", "documentSelectedSubject", "Landroid/net/Uri;", "documentTreeSelectedSubject", "openDirectory", "Landroidx/activity/result/ActivityResultLauncher;", "openDocument", "Ldev/octoshrimpy/quik/common/util/QkActivityResultContracts$OpenDocumentParams;", "presenter", "getPresenter", "()Ldev/octoshrimpy/quik/feature/backup/BackupPresenter;", "setPresenter", "(Ldev/octoshrimpy/quik/feature/backup/BackupPresenter;)V", "restoreErrorConfirmSubject", "selectFolderCancelSubject", "selectFolderConfirmSubject", "selectLocationRationaleDialog", "Landroidx/appcompat/app/AlertDialog;", "getSelectLocationRationaleDialog", "()Landroidx/appcompat/app/AlertDialog;", "selectLocationRationaleDialog$delegate", "Lkotlin/Lazy;", "selectedBackupDetailsDialog", "getSelectedBackupDetailsDialog", "selectedBackupDetailsDialog$delegate", "selectedBackupErrorDialog", "getSelectedBackupErrorDialog", "selectedBackupErrorDialog$delegate", "stopRestoreCancelSubject", "stopRestoreConfirmSubject", "stopRestoreDialog", "getStopRestoreDialog", "stopRestoreDialog$delegate", "backupClicks", "Lio/reactivex/Observable;", "confirmRestoreBackupCancelClicks", "confirmRestoreBackupConfirmClicks", "documentSelected", "documentTreeSelected", "locationRationaleCancelClicks", "locationRationaleConfirmClicks", "onAttach", "view", "Landroid/view/View;", "onContextAvailable", "context", "Landroid/content/Context;", "onViewCreated", "render", "state", "restoreClicks", "selectFile", "initialUri", "selectFolder", "selectedBackupErrorClicks", "setBackupLocationClicks", "stopRestoreCancel", "stopRestoreClicks", "stopRestoreConfirmed", "presentation_noAnalyticsRelease"})
public final class BackupController extends dev.octoshrimpy.quik.common.base.QkController<dev.octoshrimpy.quik.feature.backup.BackupView, dev.octoshrimpy.quik.feature.backup.BackupState, dev.octoshrimpy.quik.feature.backup.BackupPresenter> implements dev.octoshrimpy.quik.feature.backup.BackupView {
    @javax.inject.Inject
    public dev.octoshrimpy.quik.feature.backup.BackupPresenter presenter;
    private final io.reactivex.subjects.Subject<kotlin.Unit> selectFolderCancelSubject = null;
    private final io.reactivex.subjects.Subject<kotlin.Unit> selectFolderConfirmSubject = null;
    private final io.reactivex.subjects.Subject<kotlin.Unit> restoreErrorConfirmSubject = null;
    private final io.reactivex.subjects.Subject<kotlin.Unit> confirmRestoreCancelSubject = null;
    private final io.reactivex.subjects.Subject<kotlin.Unit> confirmRestoreConfirmSubject = null;
    private final io.reactivex.subjects.Subject<kotlin.Unit> stopRestoreConfirmSubject = null;
    private final io.reactivex.subjects.Subject<kotlin.Unit> stopRestoreCancelSubject = null;
    private final io.reactivex.subjects.Subject<android.net.Uri> documentTreeSelectedSubject = null;
    private final io.reactivex.subjects.Subject<android.net.Uri> documentSelectedSubject = null;
    private final kotlin.Lazy stopRestoreDialog$delegate = null;
    private final kotlin.Lazy selectLocationRationaleDialog$delegate = null;
    private final kotlin.Lazy selectedBackupErrorDialog$delegate = null;
    private final kotlin.Lazy selectedBackupDetailsDialog$delegate = null;
    private androidx.activity.result.ActivityResultLauncher<android.net.Uri> openDirectory;
    private androidx.activity.result.ActivityResultLauncher<dev.octoshrimpy.quik.common.util.QkActivityResultContracts.OpenDocumentParams> openDocument;
    private java.util.HashMap _$_findViewCache;
    
    public BackupController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dev.octoshrimpy.quik.feature.backup.BackupPresenter getPresenter() {
        return null;
    }
    
    @java.lang.Override
    public void setPresenter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.backup.BackupPresenter p0) {
    }
    
    private final androidx.appcompat.app.AlertDialog getStopRestoreDialog() {
        return null;
    }
    
    private final androidx.appcompat.app.AlertDialog getSelectLocationRationaleDialog() {
        return null;
    }
    
    private final androidx.appcompat.app.AlertDialog getSelectedBackupErrorDialog() {
        return null;
    }
    
    private final androidx.appcompat.app.AlertDialog getSelectedBackupDetailsDialog() {
        return null;
    }
    
    @java.lang.Override
    protected void onContextAvailable(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @java.lang.Override
    protected void onAttach(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    @java.lang.Override
    public void onViewCreated() {
    }
    
    @java.lang.Override
    public void render(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.backup.BackupState state) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<?> setBackupLocationClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<?> restoreClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<?> locationRationaleConfirmClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<?> locationRationaleCancelClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<?> selectedBackupErrorClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<?> confirmRestoreBackupConfirmClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<?> confirmRestoreBackupCancelClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<?> stopRestoreClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<?> stopRestoreConfirmed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<?> stopRestoreCancel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<?> backupClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<android.net.Uri> documentTreeSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<android.net.Uri> documentSelected() {
        return null;
    }
    
    @java.lang.Override
    public void selectFolder(@org.jetbrains.annotations.NotNull
    android.net.Uri initialUri) {
    }
    
    @java.lang.Override
    public void selectFile(@org.jetbrains.annotations.NotNull
    android.net.Uri initialUri) {
    }
}