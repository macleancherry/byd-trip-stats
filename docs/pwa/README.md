# Sealion 7 Trip Dashboard — PWA

The browser-based companion dashboard: load a BYD Trip Stats backup (`.db`) and browse
trip history, charging sessions, routes, and charts offline. No server, no build step —
plain HTML + CSS + vanilla JS, using Chart.js and Leaflet from CDN (cached by the
service worker after the first load).

This directory is mirrored byte-for-byte into `app/src/main/assets/pwa/` so the native
app can serve the same dashboard from its own embedded HTTP server while the car is on
(`liveMode`, detected via a `/api/status` probe). **Keep both copies in sync** — when you
edit a file here, copy it into `app/src/main/assets/pwa/` too.

```
docs/pwa/
├── index.html     # the whole app
├── manifest.json  # PWA manifest (install prompt, theme color)
├── sw.js          # service worker — offline cache + CDN cache-on-success
├── _headers       # Cloudflare HTTP headers (security + caching)
└── icons/         # PWA icons
```

## Preview locally

```bash
cd docs/pwa
python3 -m http.server 8080
# open http://localhost:8080
```

## Deploy to Cloudflare

The repo's `wrangler.toml` (at the repo root) is already configured to serve this
directory as a static-assets Worker.

### Option A — Git integration / Workers Builds (recommended)

1. Push this repo to GitHub.
2. Cloudflare dashboard → **Workers & Pages → Create → Connect to Git**.
3. Select the repo, leave the **build command** empty (it's static assets) and the
   **deploy command** as `npx wrangler deploy` — the root `wrangler.toml` handles the rest.
4. Deploy. Every push to the production branch redeploys automatically.

### Option B — Direct upload with Wrangler

```bash
# one-time: npm i -g wrangler  (and `wrangler login`)
npx wrangler deploy
```

### Custom domain

Workers & Pages → your project → **Custom domains** → add your domain and follow the
DNS steps. Until then the dashboard is live at `https://<project>.<subdomain>.workers.dev`.
