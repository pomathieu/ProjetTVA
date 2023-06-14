import PersistentDrawerLeft from './components/Drawer'
import { Inter } from 'next/font/google'
import './globals.css';


const inter = Inter({ subsets: ['latin'] })

export const metadata = {
  title: 'Ariane Trade',
  description: 'Société de conseil en douane opérationelle et stratégique',
}

export default function RootLayout({children,}: {
  children: React.ReactNode
}) {
  return (
    <html lang="en">
      <head>
        <meta charSet="utf-8" />
        <title>{metadata.title}</title>
        <meta name="description" content={metadata.description} />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="icon" href="/favicon.ico" />
      </head>
      <body className={inter.className} id="body">
        <PersistentDrawerLeft />
        {children}
      </body>
    </html>
  )
}
