package com.example.travelhelper.data.di

import android.content.ContentResolver
import com.example.travelhelper.data.repository.VisionRepository
import com.example.travelhelper.data.repository.VisionRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DataModule {
    @Provides
    @Singleton
    fun provideVisionRepository(contentResolver: ContentResolver): VisionRepository {
        return VisionRepositoryImpl(contentResolver)
    }
}