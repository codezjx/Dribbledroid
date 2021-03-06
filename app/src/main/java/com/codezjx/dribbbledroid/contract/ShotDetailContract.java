package com.codezjx.dribbbledroid.contract;

import com.codezjx.dribbbledroid.model.Comment;
import com.codezjx.dribbbledroid.model.Shot;
import com.codezjx.dribbbledroid.presenter.BasePresenter;
import com.codezjx.dribbbledroid.ui.BaseView;

import java.util.List;

/**
 * Created by codezjx on 2016/6/22.<br/>
 * This specifies the contract between the view and the presenter.
 */
public interface ShotDetailContract {

    interface View extends BaseView<Presenter> {

        void showShotDetail(Shot shot);

        void showComments(List<Comment> comments);

        void showError(String errorMsg);
    }

    interface Presenter extends BasePresenter {
        
        void loadShotComments(String shotId);
        
    }
}
