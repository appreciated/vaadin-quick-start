package com.github.appreciated.quickstart.base.navigation.theme;

import com.github.appreciated.quickstart.base.listeners.NavigationListener;
import com.github.appreciated.quickstart.base.pages.ComponentPage;
import com.github.appreciated.quickstart.base.pages.FinishablePage;
import com.github.appreciated.quickstart.base.pages.attributes.HasContextActions;

/**
 * Created by appreciated on 28.06.2017.
 */
public interface ProgressStepperView extends ComponentPage, HasContextActions, NavigationListener, FinishablePage.FinishListener {
}
