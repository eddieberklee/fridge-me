package com.compscieddy.fridgeme;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

  private static final Lawg lawg = Lawg.newInstance(MainActivity.class.getSimpleName());

  @BindView(R.id.tv_greeting) TextView mTvGreeting;
  @BindView(R.id.rv_ingredients) RecyclerView mRvIngredients;
  @BindView(R.id.tv_empty_prompt) TextView mTvEmptyPrompt;
  @BindView(R.id.btn_add_item) FloatingActionButton mBtnAddItem;
  @BindView(R.id.rv_recipes) RecyclerView mRvRecipes;

  private RecipesListAdapter mRecipesListAdapter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
    initViews();
  }

  private void initViews() {
    mRvRecipes.setHasFixedSize(true);
    mRecipesListAdapter = new RecipesListAdapter();
    mRvRecipes.setAdapter(mRecipesListAdapter);
  }
}