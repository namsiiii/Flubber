package com.appolica.flubber;

import android.animation.Animator;
import android.view.View;
import android.view.animation.Interpolator;

public class AnimationBody {
    private boolean autoStart;
    private boolean autoHide;

    private float force = 1;
    private float damping = 0.7f;
    private float velocity = 0.7f;
    private float x;
    private float y;
    private float scaleX;
    private float scaleY;
    private float rotate;
    private float opacity = 1f;

    private int repeatCount = 0;
    private long delay = 0L;
    private long duration = 700L;
    private boolean animateFrom;

    private Flubber.AnimationPreset animation;
    private Interpolator interpolator;
    private View view;

    public AnimationBody() {
    }

    public Animator create() {
        return Flubber.create(this);
    }

    public boolean autoStart() {
        return autoStart;
    }

    public void setAutoStart(boolean autoStart) {
        this.autoStart = autoStart;
    }

    public boolean autoHide() {
        return autoHide;
    }

    public void setAutoHide(boolean autoHide) {
        this.autoHide = autoHide;
    }

    public float getForce() {
        return force;
    }

    public void setForce(float force) {
        this.force = force;
    }

    public float getDamping() {
        return damping;
    }

    public void setDamping(float damping) {
        this.damping = damping;
    }

    public float getVelocity() {
        return velocity;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    public int getRepeatCount() {
        return repeatCount;
    }

    public void setRepeatCount(int repeatCount) {
        this.repeatCount = repeatCount;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getScaleX() {
        return scaleX;
    }

    public void setScaleX(float scaleX) {
        this.scaleX = scaleX;
    }

    public float getScaleY() {
        return scaleY;
    }

    public void setScaleY(float scaleY) {
        this.scaleY = scaleY;
    }

    public float getRotate() {
        return rotate;
    }

    public void setRotate(float rotate) {
        this.rotate = rotate;
    }

    public float getOpacity() {
        return opacity;
    }

    public void setOpacity(float opacity) {
        this.opacity = opacity;
    }

    public long getDelay() {
        return delay;
    }

    public void setDelay(long delay) {
        this.delay = delay;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public boolean animateFrom() {
        return animateFrom;
    }

    public void setAnimateFrom(boolean animateFrom) {
        this.animateFrom = animateFrom;
    }

    public Flubber.AnimationPreset getAnimation() {
        return animation;
    }

    public void setAnimation(Flubber.AnimationPreset animation) {
        this.animation = animation;
    }

    public Interpolator getInterpolator() {
        return interpolator;
    }

    public void setInterpolator(Interpolator interpolator) {
        this.interpolator = interpolator;
    }

    public void setView(View view) {
        this.view = view;
    }

    public View getView() {
        return view;
    }

    public static final class Builder {

        private View view;

        private boolean autoStart;
        private boolean autoHide;

        private float force = 1;
        private float damping = 0.7f;
        private float velocity = 0.7f;
        private float x;
        private float y;
        private float scaleX;
        private float scaleY;
        private float rotate;
        private float opacity = 1f;

        private int repeatCount = 0;
        private long delay = 0L;
        private long duration = 700L;
        private boolean animateFrom;

        private Flubber.AnimationPreset animation;
        private Interpolator interpolator;

        private Builder(View view) {
            this.view = view;
        }

        public static Builder getBuilder(View view) {
            return new Builder(view);
        }

        public Builder autoStart(boolean autoStart) {
            this.autoStart = autoStart;
            return this;
        }

        public Builder autoHide(boolean autoHide) {
            this.autoHide = autoHide;
            return this;
        }

        public Builder force(float force) {
            this.force = force;
            return this;
        }

        public Builder damping(float damping) {
            this.damping = damping;
            return this;
        }

        public Builder velocity(float velocity) {
            this.velocity = velocity;
            return this;
        }

        public Builder repeatCount(int repeatCount) {
            this.repeatCount = repeatCount;
            return this;
        }

        public Builder x(float x) {
            this.x = x;
            return this;
        }

        public Builder y(float y) {
            this.y = y;
            return this;
        }

        public Builder scaleX(float scaleX) {
            this.scaleX = scaleX;
            return this;
        }

        public Builder scaleY(float scaleY) {
            this.scaleY = scaleY;
            return this;
        }

        public Builder rotate(float rotate) {
            this.rotate = rotate;
            return this;
        }

        public Builder opacity(float opacity) {
            this.opacity = opacity;
            return this;
        }

        public Builder delay(long delay) {
            this.delay = delay;
            return this;
        }

        public Builder duration(long duration) {
            this.duration = duration;
            return this;
        }

        public Builder animateFrom(boolean animateFrom) {
            this.animateFrom = animateFrom;
            return this;
        }

        public Builder animation(Flubber.AnimationPreset animation) {
            this.animation = animation;
            return this;
        }

        public Builder interpolator(Flubber.Curve curve) {
            this.interpolator = Flubber.getInterpolator(curve);
            return this;
        }

        public Builder interpolator(Interpolator interpolator) {
            this.interpolator = interpolator;
            return this;
        }

        public Animator create() {
            return build().create();
        }

        public AnimationBody build() {
            final AnimationBody animationBody = new AnimationBody();
            animationBody.setAutoStart(autoStart);
            animationBody.setAutoHide(autoHide);
            animationBody.setForce(force);
            animationBody.setDamping(damping);
            animationBody.setVelocity(velocity);
            animationBody.setRepeatCount(repeatCount);
            animationBody.setX(x);
            animationBody.setY(y);
            animationBody.setScaleX(scaleX);
            animationBody.setScaleY(scaleY);
            animationBody.setRotate(rotate);
            animationBody.setOpacity(opacity);
            animationBody.setDelay(delay);
            animationBody.setDuration(duration);
            animationBody.setAnimateFrom(animateFrom);
            animationBody.setAnimation(animation);
            animationBody.setInterpolator(interpolator);
            animationBody.setView(view);

            return animationBody;
        }
    }
}